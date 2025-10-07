package com.bik.movieinfo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long budget;
    private String genres;
    private String homepage;
    private String keywords;
    private String originalLanguage;
    private String originalTitle;

    @Column(length = 5000)
    private String overview;

    private Double popularity;
    private String productionCompanies;
    private String productionCountries;
    private LocalDate releaseDate;
    private Long revenue;
    private Integer runtime;
    private String spokenLanguages;
    private String status;

    @Column(length = 1000)
    private String tagline;

    private String title;
    private Double voteAverage;
    private Integer voteCount;

    @Column(length = 5000)
    private String cast;

    @Column(length = 5000)
    private String crew;

    private String director;

}
