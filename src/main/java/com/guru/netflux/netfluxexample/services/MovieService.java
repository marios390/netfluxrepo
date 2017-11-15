package com.guru.netflux.netfluxexample.services;

import com.guru.netflux.netfluxexample.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Flux<MovieEvent> events(String movieId);
    Mono<MovieEvent> getMovieById(String id);
    Flux<MovieEvent> getAllMovies();

}
