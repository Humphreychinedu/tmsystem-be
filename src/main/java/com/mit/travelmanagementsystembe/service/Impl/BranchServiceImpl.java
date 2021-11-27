package com.mit.travelmanagementsystembe.service.Impl;


import com.mit.travelmanagementsystembe.entity.Branch;
import com.mit.travelmanagementsystembe.service.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {

    @Override
    public Optional<Branch> createBranch(Branch branch) {
        return Optional.empty();
    }

    @Override
    public Optional<Branch> updateBranch(Branch branch) {
        return Optional.empty();
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Branch> getBranches() {
        return null;
    }
}
