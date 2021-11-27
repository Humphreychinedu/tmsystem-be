package com.mit.travelmanagementsystembe.service.Impl;


import com.mit.travelmanagementsystembe.entity.Branch;
import com.mit.travelmanagementsystembe.repository.BranchRepository;
import com.mit.travelmanagementsystembe.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    @Override
    public Optional<Branch> createBranch(Branch branch) {
        return Optional.of(branchRepository.save(branch));
    }

    @Override
    public Optional<Branch> updateBranch(Branch branch) {
        return  Optional.of(branchRepository.save(branch));
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public List<Branch> getBranches() {
        return branchRepository.findAll();
    }
}
