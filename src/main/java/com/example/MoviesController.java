package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MoviesController {

    @Autowired
    private MoviesRepository moviesRepository;

    @RequestMapping(value="/movies/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("movies", moviesRepository.findAll());
        return "movies/index";
    }

    @RequestMapping(value="/movies/add", method = RequestMethod.GET)
    public String add() {
        return "movies/add";
    }

    @RequestMapping(value="/movies/add", method = RequestMethod.POST)
    public String add(Movie movie) {
        movie = moviesRepository.save(movie);
        return "redirect:/movies/detail/" + movie.getId();
    }

    @RequestMapping(value="/movies/detail/{movieId}", method = RequestMethod.GET)
    public String details(@PathVariable("movieId") Integer movieId, Model model) {
        Movie movie = moviesRepository.findOne(movieId);
        model.addAttribute("movie", movie);

        return "movies/detail";
    }
}
