package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Supervisor;
import com.mit.travelmanagementsystembe.service.SupervisorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisorServiceImpl implements SupervisorService {
    @Override
    public Optional<Supervisor> createSupervisor(Supervisor supervisor) {
        return Optional.empty();
    }

    @Override
    public Optional<Supervisor> updateSupervisor(Supervisor supervisor) {
        return Optional.empty();
    }

    @Override
    public Optional<Supervisor> getSupervisorById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Supervisor> getSupervisors() {
        return null;
    }
}
