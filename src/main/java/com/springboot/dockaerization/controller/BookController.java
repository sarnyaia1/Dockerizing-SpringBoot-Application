package com.springboot.dockaerization.controller;

import com.springboot.dockaerization.repository.BookRepository;
import com.springboot.dockaerization.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
