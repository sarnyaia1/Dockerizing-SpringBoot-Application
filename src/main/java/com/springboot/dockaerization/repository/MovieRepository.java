package com.springboot.dockaerization.repository;

import com.springboot.dockaerization.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, Integer> {
}
