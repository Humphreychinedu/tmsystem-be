package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Department;
import com.mit.travelmanagementsystembe.repository.DepartmentRepository;
import com.mit.travelmanagementsystembe.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public Optional<Department> createDepartment(Department department) {
        return Optional.of(departmentRepository.save(department));
    }

    @Override
    public Optional<Department> updateDepartment(Department department) {
        return Optional.of(departmentRepository.save(department));
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
