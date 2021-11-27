package com.mit.travelmanagementsystembe.repository;

import com.mit.travelmanagementsystembe.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
