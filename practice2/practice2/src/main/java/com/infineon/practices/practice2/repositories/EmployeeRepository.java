package com.infineon.practices.practice2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infineon.practices.practice2.models.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}
