package com.infineon.practices.practice2.services;

import java.util.List;

import com.infineon.practices.practice2.models.Employee;

public interface EmployeeService {
    Employee getEmployee(long id);
    List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);
}
