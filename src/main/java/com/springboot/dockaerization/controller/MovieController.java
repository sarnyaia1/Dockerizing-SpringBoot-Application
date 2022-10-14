package com.springboot.dockaerization.controller;

import com.springboot.dockaerization.repository.MovieRepository;
import com.springboot.dockaerization.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping
    public Movie saveMovie (@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @GetMapping
    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
