package com.bik.movieinfo.application;

import com.bik.movieinfo.data.MovieRepository;
import com.bik.movieinfo.domain.Movie;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository repository;

    public Integer uploadMovies(MultipartFile file) {
        try {
            Set<Movie> movies = parseMovies(file);
            repository.saveAll(movies);
            return movies.size();
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    private Set<Movie> parseMovies(MultipartFile file) throws IOException {
        try(Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            HeaderColumnNameMappingStrategy<MoviesRepresentation> strategy = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(MoviesRepresentation.class);
            CsvToBean<MoviesRepresentation> csvToBean = new CsvToBeanBuilder<MoviesRepresentation>(reader)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withQuoteChar('"')
                    .withSeparator(',')
                    .build();
            return csvToBean.parse()
                    .stream()
                    .map(csvLine -> Movie.builder()
                            .budget(csvLine.getBdgt())
                            .genres(csvLine.getGnrs())
                            .homepage(csvLine.getHomepg())
                            .movieId(csvLine.getMvid())
                            .keywords(csvLine.getKeywrds())
                            .originalLanguage(csvLine.getLang())
                            .originalTitle(csvLine.getTitle())
                            .overview(csvLine.getOvrvw())
                            .popularity(csvLine.getPop())
                            .productionCompanies(csvLine.getProdCos())
                            .productionCountries(csvLine.getProdCts())
                            .releaseDate(csvLine.getRelDate())
                            .revenue(csvLine.getRevnue())
                            .runtime(csvLine.getRuntm())
                            .spokenLanguages(csvLine.getSpknLangs())
                            .status(csvLine.getStat())
                            .tagline(csvLine.getTglne())
                            .title(csvLine.getTitle())
                            .voteAverage(csvLine.getVoteAvg())
                            .voteCount(csvLine.getVoteCnt())
                            .cast(csvLine.getCst())
                            .crew(csvLine.getCrw())
                            .director(csvLine.getDirctr())
                            .build()
                    )
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}