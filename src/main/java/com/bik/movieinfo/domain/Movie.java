package com.bik.movieinfo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long budget;
    private String genres;
    private String homepage;
    @Column(name = "movie_id")
    private Long movieId;
    private String keywords;
    private String originalLanguage;
    @Column(name = "original_title", length = 1000)
    private String originalTitle;

    @Column(length = 5000)
    private String overview;

    private Double popularity;
    @Column(name = "production_companies")
    private String productionCompanies;
    @Column(name = "production_countries")
    private String productionCountries;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private Long revenue;
    private Double runtime;
    @Column(name = "spoken_languages")
    private String spokenLanguages;
    private String status;

    @Column(length = 1000)
    private String tagline;

    private String title;
    @Column(name = "vote_average")
    private Double voteAverage;
    @Column(name = "vote_count")
    private Double voteCount;

    @Column(name = "movie_cast", length = 5000)
    private String cast;

    @Column(length = 5000)
    private String crew;

    private String director;

}
