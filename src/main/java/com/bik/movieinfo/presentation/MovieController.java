package com.bik.movieinfo.presentation;

import com.bik.movieinfo.application.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService service;
    @PostMapping(value = "/upload", consumes = {"multipart/form-data"} )
    public ResponseEntity<Integer> uploadMovies(@RequestPart("file") MultipartFile file)  {
        return ResponseEntity.ok(service.uploadMovies(file));
    }
}
