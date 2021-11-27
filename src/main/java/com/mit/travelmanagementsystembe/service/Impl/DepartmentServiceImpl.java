package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Department;
import com.mit.travelmanagementsystembe.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public Optional<Department> createDepartment(Department department) {
        return Optional.empty();
    }

    @Override
    public Optional<Department> updateDepartment(Department department) {
        return Optional.empty();
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Department> getDepartments() {
        return null;
    }
}
