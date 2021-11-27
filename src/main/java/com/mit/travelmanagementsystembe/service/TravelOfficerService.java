package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.TravelOfficer;

import java.util.List;
import java.util.Optional;

public interface TravelOfficerService {

    Optional<TravelOfficer> createTravelOfficer(TravelOfficer travelOfficer);

    Optional<TravelOfficer> updateTravelOfficer(TravelOfficer travelOfficer);

    Optional<TravelOfficer> getTravelOfficerById(Long id);

    List<TravelOfficer> getTravelOfficers();
}
