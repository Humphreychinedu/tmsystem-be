package com.mit.travelmanagementsystembe.repository;

import com.mit.travelmanagementsystembe.entity.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}
