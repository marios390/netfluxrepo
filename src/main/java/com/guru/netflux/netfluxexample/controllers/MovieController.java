package com.guru.netflux.netfluxexample.controllers;

import com.guru.netflux.netfluxexample.domain.Movie;
import com.guru.netflux.netfluxexample.domain.MovieEvent;
import com.guru.netflux.netfluxexample.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/{id}/events")
    Flux<MovieEvent> streamMovieEvents(@PathVariable String id){

        return null;
    }
    @GetMapping(value = "/{id}")
    Mono<Movie> getMovieById(String id){
        return null;
    }
    Flux<MovieEvent> getAllMovies(){
        return null;
    }
}
