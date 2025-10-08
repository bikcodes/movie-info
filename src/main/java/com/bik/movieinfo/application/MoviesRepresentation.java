package com.bik.movieinfo.application;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoviesRepresentation {
    @CsvBindByName(column = "budget")
    private Long bdgt;
    @CsvBindByName(column = "genres")
    private String gnrs;
    @CsvBindByName(column = "homepage")
    private String homepg;
    @CsvBindByName(column = "id")
    private Long mvid;
    @CsvBindByName(column = "keywords")
    private String keywrds;
    @CsvBindByName(column = "original_language")
    private String lang;
    @CsvBindByName(column = "original_title")
    private String title;
    @CsvBindByName(column = "overview")
    private String ovrvw;
    @CsvBindByName(column = "popularity")
    private Double pop;
    @CsvBindByName(column = "production_companies")
    private String prodCos;
    @CsvBindByName(column = "production_countries")
    private String prodCts;
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByName(column = "release_date")
    private LocalDate relDate;
    @CsvBindByName(column = "revenue")
    private Long revnue;
    @CsvBindByName(column = "runtime")
    private Double runtm;
    @CsvBindByName(column = "spoken_languages")
    private String spknLangs;
    @CsvBindByName(column = "status")
    private String stat;
    @CsvBindByName(column = "tagline")
    private String tglne;
    @CsvBindByName(column = "vote_average")
    private Double voteAvg;
    @CsvBindByName(column = "vote_count")
    private Double voteCnt;
    @CsvBindByName(column = "movie_cast")
    private String cst;
    @CsvBindByName(column = "crew")
    private String crw;
    @CsvBindByName(column = "director")
    private String dirctr;
}
