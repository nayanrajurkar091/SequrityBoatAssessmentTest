package com.app.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;

    private List<LocalDateTime> showtimes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<LocalDateTime> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<LocalDateTime> showtimes) {
		this.showtimes = showtimes;
	}

	public Movie(Long id, String title, String genre, List<LocalDateTime> showtimes) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.showtimes = showtimes;
	}

  
}