package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> createEmployee(Employee employee);

    Optional<Employee> updateEmployee(Employee employee);

    Optional<Employee> getEmployeeById(Long id);

    List<Employee> getEmployees();

}
