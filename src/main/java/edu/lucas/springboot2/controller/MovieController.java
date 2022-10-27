package edu.lucas.springboot2.controller;

import edu.lucas.springboot2.domain.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller
@RestController
@RequestMapping("movie")
public class MovieController {
    // localhost:8080/movie/list
    @GetMapping(path = "list")
    public List<Movie> list() {
        return List.of(new Movie("O Senhor dos Anéis"), new Movie("Batman"));
    }
}
