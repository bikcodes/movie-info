package com.bik.movieinfo.presentation.mapper;

import com.bik.movieinfo.domain.Movie;
import com.bik.movieinfo.presentation.dto.MovieResponse;

public class MovieMapper {
    public static MovieResponse toResponse(Movie movie){
        return new MovieResponse(
                movie.getId(),
                movie.getBudget(),
                movie.getGenres(),
                movie.getHomepage(),
                movie.getMovieId(),
                movie.getKeywords(),
                movie.getOriginalLanguage(),
                movie.getOriginalTitle(),
                movie.getOverview(),
                movie.getPopularity(),
                movie.getProductionCompanies(),
                movie.getProductionCountries(),
                movie.getReleaseDate(),
                movie.getRevenue(),
                movie.getRuntime(),
                movie.getSpokenLanguages(),
                movie.getStatus(),
                movie.getTagline(),
                movie.getTitle(),
                movie.getVoteAverage(),
                movie.getVoteCount(),
                movie.getCast(),
                movie.getCrew(),
                movie.getDirector()
        );
    }
}
