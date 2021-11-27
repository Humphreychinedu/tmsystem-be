package com.mit.travelmanagementsystembe.repository;

import com.mit.travelmanagementsystembe.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
}
