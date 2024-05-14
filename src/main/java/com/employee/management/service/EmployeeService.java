package com.employee.management.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.entity.Employees;
import com.employee.management.repository.EmployeeRepository;


@Service
public class EmployeeService {

	 @Autowired Employees employees;
	 @Autowired EmployeeRepository employeeRepository;

	    // Method to add a new employee
	    public Employee addEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    // Method to add multiple employees
	    public List<Employee> addEmployees(List<Employee> employees) {
	        return employeeRepository.saveAll(employees);
	    }

	    // Method to get all employees
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

}
