package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Grade;
import com.mit.travelmanagementsystembe.repository.GradeRepository;
import com.mit.travelmanagementsystembe.service.GradeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GradeServiceImpl implements GradeService {

    private GradeRepository gradeRepository;

    @Override
    public Optional<Grade> createGrade(Grade grade) {
        return Optional.of(gradeRepository.save(grade));
    }

    @Override
    public Optional<Grade> updateGrade(Grade grade) {
        return Optional.empty();
    }

    @Override
    public Optional<Grade> getGradeById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Grade> getGrades() {
        return gradeRepository.findAll();
    }
}
