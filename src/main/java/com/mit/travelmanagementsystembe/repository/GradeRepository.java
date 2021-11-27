package com.mit.travelmanagementsystembe.repository;

import com.mit.travelmanagementsystembe.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
