package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Grade;
import com.mit.travelmanagementsystembe.repository.GradeRepository;
import com.mit.travelmanagementsystembe.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;

    @Override
    public Optional<Grade> createGrade(Grade grade) {
        return Optional.of(gradeRepository.save(grade));
    }

    @Override
    public Optional<Grade> updateGrade(Grade grade) {
        return Optional.of(gradeRepository.save(grade));
    }

    @Override
    public Optional<Grade> getGradeById(Long id) {
        return gradeRepository.findById(id);
    }

    @Override
    public List<Grade> getGrades() {
        return gradeRepository.findAll();
    }
}
