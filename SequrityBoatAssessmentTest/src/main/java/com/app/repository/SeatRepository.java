package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Movie;
import com.app.model.Seat;



public interface SeatRepository extends JpaRepository<Seat, Long> {
	
    List<Seat> findByMovie(Movie movie);

    
}
