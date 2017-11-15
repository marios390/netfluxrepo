package com.guru.netflux.netfluxexample.repositories;

import com.guru.netflux.netfluxexample.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieRepository  extends ReactiveMongoRepository<Movie,String>{


}
