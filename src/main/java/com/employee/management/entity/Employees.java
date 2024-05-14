package com.employee.management.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employees {
	private List<Employee> employeeList;


    public Employees() {
        this.employeeList = new ArrayList<>();
        initializeEmployees(); // Optional: Initialize with sample data
    }

    private void initializeEmployees() {
        // Initialize with sample data if needed
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        // Generate employee_id (e.g., using a sequence or auto-increment)
        int newEmployeeId = employeeList.size() + 1;
        employee.setEmployee_id(newEmployeeId);

        // Add employee to the list
        employeeList.add(employee);
    }

    // Method to get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
