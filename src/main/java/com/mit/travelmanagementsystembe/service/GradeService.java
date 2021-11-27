package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Grade;

import java.util.List;
import java.util.Optional;

public interface GradeService {

    Optional<Grade> createGrade(Grade grade);

    Optional<Grade> updateGrade(Grade grade);

    Optional<Grade> getGradeById(Long id);

    List<Grade> getGrades();
}
