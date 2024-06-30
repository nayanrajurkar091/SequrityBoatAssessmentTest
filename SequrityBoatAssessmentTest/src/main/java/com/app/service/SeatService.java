package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Movie;
import com.app.model.Seat;
import com.app.repository.SeatRepository;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAvailableSeats(Movie movie) {
    	
        return seatRepository.findByMovie(movie);
    }

}