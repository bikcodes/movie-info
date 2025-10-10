package com.bik.movieinfo.presentation.dto;

import java.time.LocalDate;

public record MovieResponse(
        Long id,
        Long budget,
        String genres,
        String homepage,
        Long movieId,
        String keywords,
        String originalLanguage,
        String originalTitle,
        String overview,
        Double popularity,
        String productionCompanies,
        String productionCountries,
        LocalDate releaseDate,
        Long revenue,
        Double runtime,
        String spokenLanguages,
        String status,
        String tagline,
        String title,
        Double voteAverage,
        Double voteCount,
        String cast,
        String crew,
        String director
) {
}
