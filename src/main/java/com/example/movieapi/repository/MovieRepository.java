package com.example.movieapi.repository;

import com.example.movieapi.model.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository <Movie,String>{

}
