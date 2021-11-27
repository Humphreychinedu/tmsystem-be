package com.mit.travelmanagementsystembe.controller;

import com.mit.travelmanagementsystembe.entity.*;
import com.mit.travelmanagementsystembe.service.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/management")
@AllArgsConstructor
public class TravelManagementController {

    private EmployeeService employeeService;
    private DepartmentService departmentService;
    private GroupsService groupsService;
    private SupervisorService supervisorService;
    private TravelOfficerService travelOfficerService;
    private BranchService branchService;
    private GradeService gradeService;
    private BookingService bookingService;


    @PostMapping(value = "/employee")
    public ResponseEntity<Optional<Employee>> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.OK);
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PutMapping(value = "/employee")
    public ResponseEntity<Optional<Employee>> updateEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    @PostMapping(value = "/department")
    public ResponseEntity<Optional<Department>> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createDepartment(department), HttpStatus.OK);
    }

    @GetMapping(value = "/department/{id}")
    public ResponseEntity<Optional<Department>> getDepartment(@PathVariable Long id) {
        return new ResponseEntity<>(departmentService.getDepartmentById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/department")
    public ResponseEntity<List<Department>> getDepartments() {
        return new ResponseEntity<>(departmentService.getDepartments(), HttpStatus.OK);
    }

    @PutMapping(value = "/department")
    public ResponseEntity<Optional<Department>> updateDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.updateDepartment(department), HttpStatus.OK);
    }

    @PostMapping(value = "/groups")
    public ResponseEntity<Optional<Groups>> createGroups(@RequestBody Groups groups) {
        return new ResponseEntity<>(groupsService.createGroups(groups), HttpStatus.OK);
    }

    @GetMapping(value = "/groups/{id}")
    public ResponseEntity<Optional<Groups>> getGroup(@PathVariable Long id) {
        return new ResponseEntity<>(groupsService.getGroupsById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/groups")
    public ResponseEntity<List<Groups>> getGroups(@PathVariable Long id) {
        return new ResponseEntity<>(groupsService.getGroups(), HttpStatus.OK);
    }

    @PutMapping(value = "/groups")
    public ResponseEntity<Optional<Groups>> updateGroups(@RequestBody Groups groups) {
        return new ResponseEntity<>(groupsService.updateGroups(groups), HttpStatus.OK);
    }

    @PostMapping(value = "/supervisor")
    public ResponseEntity<Optional<Supervisor>> createSupervisor(@RequestBody Supervisor supervisor) {
        return new ResponseEntity<>(supervisorService.createSupervisor(supervisor), HttpStatus.OK);
    }

    @GetMapping(value = "/supervisor")
    public ResponseEntity<List<Supervisor>> getSupervisors() {
        return new ResponseEntity<>(supervisorService.getSupervisors(), HttpStatus.OK);
    }

    @GetMapping(value = "/supervisor/{id}")
    public ResponseEntity<Optional<Supervisor>> getSupervisor(@PathVariable Long id) {
        return new ResponseEntity<>(supervisorService.getSupervisorById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/supervisor")
    public ResponseEntity<Optional<Supervisor>> updateSupervisor(@RequestBody Supervisor supervisor) {
        return new ResponseEntity<>(supervisorService.updateSupervisor(supervisor), HttpStatus.OK);
    }

    @PostMapping(value = "/travel_officer")
    public ResponseEntity<Optional<TravelOfficer>> createTravelOfficer(@RequestBody TravelOfficer travelOfficer) {
        return new ResponseEntity<>(travelOfficerService.createTravelOfficer(travelOfficer), HttpStatus.OK);
    }

    @GetMapping(value = "/travel_officer")
    public ResponseEntity<List<TravelOfficer>> getTravelOfficers() {
        return new ResponseEntity<>(travelOfficerService.getTravelOfficers(), HttpStatus.OK);
    }

    @GetMapping(value = "/travel_officer/{id}")
    public ResponseEntity<Optional<TravelOfficer>> getTravelOfficer(@PathVariable Long id) {
        return new ResponseEntity<>(travelOfficerService.getTravelOfficerById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/travel_officer")
    public ResponseEntity<Optional<TravelOfficer>> updateTravelOfficer(@RequestBody TravelOfficer travelOfficer) {
        return new ResponseEntity<>(travelOfficerService.updateTravelOfficer(travelOfficer), HttpStatus.OK);
    }

    @PostMapping(value = "/branch")
    public ResponseEntity<Optional<Branch>> createBranch(@RequestBody Branch branch) {
        return new ResponseEntity<>(branchService.createBranch(branch), HttpStatus.OK);
    }

    @GetMapping(value = "/branch")
    public ResponseEntity<List<Branch>> getBranch() {
        return new ResponseEntity<>(branchService.getBranches(), HttpStatus.OK);
    }

    @GetMapping(value = "/branch/{id}")
    public ResponseEntity<Optional<Branch>> getBranch(@PathVariable Long id) {
        return new ResponseEntity<>(branchService.getBranchById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/branch")
    public ResponseEntity<Optional<Branch>> updateBranch(@RequestBody Branch branch) {
        return new ResponseEntity<>(branchService.updateBranch(branch), HttpStatus.OK);
    }


    @PostMapping(value = "/grade")
    public ResponseEntity<Optional<Grade>> createGrade(@RequestBody Grade grade) {
        return new ResponseEntity<>(gradeService.createGrade(grade), HttpStatus.OK);
    }

    @GetMapping(value = "/grade")
    public ResponseEntity<List<Grade>> getGrades() {
        return new ResponseEntity<>(gradeService.getGrades(), HttpStatus.OK);
    }

    @GetMapping(value = "/grade/{id}")
    public ResponseEntity<Optional<Grade>> getGrade(@PathVariable Long id) {
        return new ResponseEntity<>(gradeService.getGradeById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/grade")
    public ResponseEntity<Optional<Grade>> updateGrade(@RequestBody Grade grade) {
        return new ResponseEntity<>(gradeService.updateGrade(grade), HttpStatus.OK);
    }

    @PostMapping(value = "/booking")
    public ResponseEntity<Optional<Booking>> createBooking(@RequestBody Booking booking) {
        return new ResponseEntity<>(bookingService.createBooking(booking), HttpStatus.OK);
    }

    @GetMapping(value = "/booking")
    public ResponseEntity<List<Booking>> getBookings() {
        return new ResponseEntity<>(bookingService.getBookings(), HttpStatus.OK);
    }

    @GetMapping(value = "/booking/{id}")
    public ResponseEntity<Optional<Booking>> getBooking(@PathVariable Long id) {
        return new ResponseEntity<>(bookingService.getBooking(id), HttpStatus.OK);
    }

    @PutMapping(value = "/booking")
    public ResponseEntity<Optional<Booking>> updateBooking(@RequestBody Booking booking) {
        return new ResponseEntity<>(bookingService.updateBooking(booking), HttpStatus.OK);
    }

    @GetMapping(value = "test")
    public String getTest() {
        return "hello";
    }


}


