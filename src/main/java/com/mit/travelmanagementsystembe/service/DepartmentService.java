package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Optional<Department> createDepartment(Department department);

    Optional<Department> updateDepartment(Department department);

    Optional<Department> getDepartmentById(Long id);

    List<Department> getDepartments();
}
