package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Supervisor;

import java.util.List;
import java.util.Optional;

public interface SupervisorService {

    Optional<Supervisor> createSupervisor(Supervisor supervisor);

    Optional<Supervisor> updateSupervisor(Supervisor supervisor);

    Optional<Supervisor> getSupervisorById(Long id);

    List<Supervisor> getSupervisors();
}
