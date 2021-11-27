package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.TravelOfficer;
import com.mit.travelmanagementsystembe.repository.TravelOfficerRepository;
import com.mit.travelmanagementsystembe.service.TravelOfficerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TravelOfficerServiceImpl implements TravelOfficerService {

    private final TravelOfficerRepository travelOfficerRepository;

    @Override
    public Optional<TravelOfficer> createTravelOfficer(TravelOfficer travelOfficer) {
        return Optional.of(travelOfficerRepository.save(travelOfficer));
    }

    @Override
    public Optional<TravelOfficer> updateTravelOfficer(TravelOfficer travelOfficer) {
        return Optional.of(travelOfficerRepository.save(travelOfficer));
    }

    @Override
    public Optional<TravelOfficer> getTravelOfficerById(Long id) {
        return travelOfficerRepository.findById(id);
    }

    @Override
    public List<TravelOfficer> getTravelOfficers() {
        return travelOfficerRepository.findAll();
    }
}
