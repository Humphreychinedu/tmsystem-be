package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Booking;
import com.mit.travelmanagementsystembe.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {
    @Override
    public Optional<Booking> createBooking(Booking booking) {
        return Optional.empty();
    }

    @Override
    public List<Booking> getBookings(Booking booking) {
        return null;
    }

    @Override
    public Optional<Booking> getBooking(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> updateBooking() {
        return Optional.empty();
    }
}
