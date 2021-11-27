package com.mit.travelmanagementsystembe.controller;

import com.mit.travelmanagementsystembe.entity.*;
import com.mit.travelmanagementsystembe.service.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/department")
    public ResponseEntity<Optional<Department>> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createDepartment(department), HttpStatus.OK);
    }

    @PostMapping(value = "/groups")
    public ResponseEntity<Optional<Groups>> createGroups(@RequestBody Groups groups) {
        return new ResponseEntity<>(groupsService.createGroups(groups), HttpStatus.OK);
    }

    @PostMapping(value = "/supervisor")
    public ResponseEntity<Optional<Supervisor>> createSupervisor(@RequestBody Supervisor supervisor) {
        return new ResponseEntity<>(supervisorService.createSupervisor(supervisor), HttpStatus.OK);
    }

    @PostMapping(value = "/travel_officer")
    public ResponseEntity<Optional<TravelOfficer>> createTravelOfficer(@RequestBody TravelOfficer travelOfficer) {
        return new ResponseEntity<>(travelOfficerService.createTravelOfficer(travelOfficer), HttpStatus.OK);
    }

    @PostMapping(value = "/branch")
    public ResponseEntity<Optional<Branch>> createBranch(@RequestBody Branch branch) {
        return new ResponseEntity<>(branchService.createBranch(branch), HttpStatus.OK);
    }

    @PostMapping(value = "/grade")
    public ResponseEntity<Optional<Grade>> createGrade(@RequestBody Grade grade) {
        return new ResponseEntity<>(gradeService.createGrade(grade), HttpStatus.OK);
    }

    @PostMapping(value = "/booking")
    public ResponseEntity<Optional<Booking>> createBooking(@RequestBody Booking booking) {
        return new ResponseEntity<>(bookingService.createBooking(booking), HttpStatus.OK);
    }

    @GetMapping(value = "test")
    public String getTest() {
        return "hello";
    }


}


