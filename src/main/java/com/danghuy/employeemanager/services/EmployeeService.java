package com.danghuy.employeemanager.services;

import com.danghuy.employeemanager.models.Employee;
import com.danghuy.employeemanager.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
