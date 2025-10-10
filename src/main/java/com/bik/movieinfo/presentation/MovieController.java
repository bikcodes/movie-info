package com.bik.movieinfo.presentation;

import com.bik.movieinfo.application.MovieService;
import com.bik.movieinfo.presentation.dto.MovieRequest;
import com.bik.movieinfo.presentation.dto.MovieResponse;
import com.bik.movieinfo.presentation.mapper.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("")
    public MovieResponse getMovie(@RequestBody MovieRequest request) {
        return MovieMapper.toResponse(service.findByIdAndTitle(request.id(), request.title()));
    }
}
