package com.infineon.practices.practice2.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infineon.practices.practice2.models.Employee;
import com.infineon.practices.practice2.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return this.employeeService.getEmployees();
    }

    @GetMapping("{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId") long employeeId) {
        return new ResponseEntity<Employee>(
                this.employeeService.getEmployee(employeeId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(
                this.employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
}
