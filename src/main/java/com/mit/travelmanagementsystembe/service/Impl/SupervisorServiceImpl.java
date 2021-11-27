package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Supervisor;
import com.mit.travelmanagementsystembe.repository.SupervisorRepository;
import com.mit.travelmanagementsystembe.service.SupervisorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupervisorServiceImpl implements SupervisorService {

    private final SupervisorRepository supervisorRepository;

    @Override
    public Optional<Supervisor> createSupervisor(Supervisor supervisor) {
        return Optional.of(supervisorRepository.save(supervisor));
    }

    @Override
    public Optional<Supervisor> updateSupervisor(Supervisor supervisor) {
        return Optional.of(supervisorRepository.save(supervisor));    }

    @Override
    public Optional<Supervisor> getSupervisorById(Long id) {
        return supervisorRepository.findById(id);
    }

    @Override
    public List<Supervisor> getSupervisors() {
        return supervisorRepository.findAll();
    }
}
