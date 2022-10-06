package com.springboot.dockaerization.dao;

import com.springboot.dockaerization.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
