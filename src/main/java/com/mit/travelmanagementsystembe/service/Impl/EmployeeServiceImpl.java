package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Employee;
import com.mit.travelmanagementsystembe.repository.EmployeeRepository;
import com.mit.travelmanagementsystembe.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> createEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }

    @Override
    public Optional<Employee> updateEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
