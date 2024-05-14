package com.employee.management.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

	 @Autowired
	    private EmployeeService employeeService;

	 @PostMapping("/add")
	    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	        Employee savedEmployee = employeeService.addEmployee(employee);
	        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	    }

	    // POST method to add multiple employees
	    @PostMapping("/addMultiple")
	    public ResponseEntity<List<Employee>> addEmployees(@RequestBody List<Employee> employees) {
	        List<Employee> savedEmployees = employeeService.addEmployees(employees);
	        return new ResponseEntity<>(savedEmployees, HttpStatus.CREATED);
	    }

	    // GET method to retrieve all employees
	    @GetMapping("/getAll")
	    public ResponseEntity<List<Employee>> getAllEmployees() {
	        List<Employee> employees = employeeService.getAllEmployees();
	        return new ResponseEntity<>(employees, HttpStatus.OK);
	    }
}
