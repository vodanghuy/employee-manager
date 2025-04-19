package com.danghuy.employeemanager.repositories;

import com.danghuy.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
