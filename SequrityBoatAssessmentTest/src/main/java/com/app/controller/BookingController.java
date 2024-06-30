package com.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Booking;
import com.app.model.User;
import com.app.service.BookingService;
import com.app.service.UserService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> makeBooking(@RequestBody Booking booking) {
        Booking newBooking = bookingService.makeBooking(booking);
        return ResponseEntity.ok(newBooking);
    }

    
    @Autowired
    private UserService userService;
    @GetMapping("/user/{userId}")
    public List<Booking> getBookingsByUser(@PathVariable String userId) {
        User user = userService.findUserByEmail(userId);
        if (user != null) {
            return bookingService.getBookingsByUser(user);
        } 
        else 
        {
            return Collections.emptyList();
        }
    }

}