package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchService {

    Optional<Branch> createBranch(Branch branch);

    Optional<Branch> updateBranch(Branch branch);

    Optional<Branch> getBranchById(Long id);

    List<Branch> getBranches();
}
