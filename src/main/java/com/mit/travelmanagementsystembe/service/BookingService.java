package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    Optional<Booking> createBooking(Booking booking);

    List<Booking> getBookings(Booking booking);

    Optional<Booking> getBooking(Long id);

    Optional<Booking> updateBooking();
}
