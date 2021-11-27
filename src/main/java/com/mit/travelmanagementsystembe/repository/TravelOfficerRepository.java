package com.mit.travelmanagementsystembe.repository;

import com.mit.travelmanagementsystembe.entity.TravelOfficer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelOfficerRepository extends JpaRepository<TravelOfficer, Long> {
}
