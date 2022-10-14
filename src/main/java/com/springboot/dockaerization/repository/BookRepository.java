package com.springboot.dockaerization.repository;

import com.springboot.dockaerization.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
