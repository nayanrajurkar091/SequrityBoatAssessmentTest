package com.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Movie;
import com.app.model.Seat;
import com.app.service.MovieService;
import com.app.service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;
    private MovieService movieService;

    @GetMapping("/movie/{movieId}")
  
    public List<Seat> getAvailableSeatsForMovie(@PathVariable Long movieId) {
    	
    	 
        Movie movie = movieService.getMovieById(movieId);
        if (movie != null) {
            return seatService.getAvailableSeats(movie);
        } 
        else 
        {
            return Collections.emptyList();
        }
    }

}