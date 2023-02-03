package com.infineon.practices.practice2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infineon.practices.practice2.exceptions.ResourceNotFoundException;
import com.infineon.practices.practice2.models.Employee;
import com.infineon.practices.practice2.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployee(long id) {
        return this.employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee", "id", id));
    }

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }
}
