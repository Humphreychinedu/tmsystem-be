package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Accommodation;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {

    Optional<Accommodation> createAccommodation(Accommodation accommodation);

    Optional<Accommodation> updateAccommodation(Accommodation accommodation);

    Optional<Accommodation> getAccommodationById(Long id);

    List<Accommodation> getAccommodations();

}
