package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.TravelOfficer;
import com.mit.travelmanagementsystembe.service.TravelOfficerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelOfficerServiceImpl implements TravelOfficerService {
    @Override
    public Optional<TravelOfficer> createTravelOfficer(TravelOfficer travelOfficer) {
        return Optional.empty();
    }

    @Override
    public Optional<TravelOfficer> updateTravelOfficer(TravelOfficer travelOfficer) {
        return Optional.empty();
    }

    @Override
    public Optional<TravelOfficer> getTravelOfficerById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<TravelOfficer> getTravelOfficers() {
        return null;
    }
}
