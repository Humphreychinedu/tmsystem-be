package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Booking;
import com.mit.travelmanagementsystembe.repository.BookingRepository;
import com.mit.travelmanagementsystembe.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public Optional<Booking> createBooking(Booking booking) {
        return Optional.of(bookingRepository.save(booking));
    }

    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Optional<Booking> getBooking(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public Optional<Booking> updateBooking(Booking booking) {
        return Optional.of(bookingRepository.save(booking));
    }
}
