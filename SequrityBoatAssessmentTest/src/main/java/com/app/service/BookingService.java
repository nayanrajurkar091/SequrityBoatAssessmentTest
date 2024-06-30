package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Booking;
import com.app.model.User;
import com.app.repository.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking makeBooking(Booking booking) {

    	return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByUser(User user) {
    	
        return bookingRepository.findByUser(user);
    }

}
