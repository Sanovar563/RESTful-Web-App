package com.employee.management.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepository;




public class EmployeeServiceTests {

	 @Mock
	    private EmployeeRepository employeeRepository;

	    @InjectMocks
	    private EmployeeService employeeService;

	    @BeforeEach
	    public void init() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testAddEmployee() {
	        Employee employee = new Employee();
	        employee.setFirst_name("John");
	        employee.setFirst_name("Doe");
	        employee.setEmail("john@example.com");
	        employee.setTitle("Manager");

	        when(employeeRepository.save(employee)).thenReturn(employee);

	        Employee savedEmployee = employeeService.addEmployee(employee);

	        assertEquals(employee, savedEmployee);
	        verify(employeeRepository, times(1)).save(employee);
	    }

	    @Test
	    public void testAddEmployees() {
	        List<Employee> employees = Arrays.asList(
	            createEmployee("John", "Doe", "john@example.com", "Manager"),
	            createEmployee("Jane", "Smith", "jane@example.com", "Developer")
	        );
	        when(employeeRepository.saveAll(employees)).thenReturn(employees);

	        List<Employee> savedEmployees = employeeService.addEmployees(employees);

	        assertEquals(employees.size(), savedEmployees.size());
	        verify(employeeRepository, times(1)).saveAll(employees);
	    }

	    @Test
	    public void testGetAllEmployees() {
	        List<Employee> mockEmployees = Arrays.asList(
	            createEmployee("John", "Doe", "john@example.com", "Manager"),
	            createEmployee("Jane", "Smith", "jane@example.com", "Developer")
	        );
	        when(employeeRepository.findAll()).thenReturn(mockEmployees);

	        List<Employee> allEmployees = employeeService.getAllEmployees();

	        assertEquals(mockEmployees.size(), allEmployees.size());
	        verify(employeeRepository, times(1)).findAll();
	    }

	    private Employee createEmployee(String firstName, String lastName, String email, String title) {
	        Employee employee = new Employee();
	        employee.setFirst_name(firstName);
	        employee.setFirst_name(lastName);
	        employee.setEmail(email);
	        employee.setTitle(title);
	        return employee;
	    }
}
