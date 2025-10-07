package com.bik.movieinfo.application;

import com.bik.movieinfo.data.MovieRepository;
import com.bik.movieinfo.domain.Movie;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;

@Service
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
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}