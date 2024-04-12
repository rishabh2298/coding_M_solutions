package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	
	// Part-1
	
	@PostMapping(value = "/employee")
	public ResponseEntity<Employee> addEmployeeHandler(@Valid @RequestBody Employee employee){
		
		Employee savedEmployee = employeeService.addNewEmployee(employee);
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.ACCEPTED);
	}
	
	
	// part-2

	@GetMapping(value = "/employee/{id}")
	public ResponseEntity<Employee> getEmployeeDetailsHandler(@PathVariable("id") Integer empId){
		
		Employee savedEmployee = employeeService.getEmployeeById(empId);
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.FOUND);
	}
	

	@GetMapping(value = "/employees")
	public ResponseEntity<List<Employee>> getTop5EmployeeHandler(){
		
		List<Employee> savedEmployee = employeeService.getTop5Employees();
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.ACCEPTED);
	}
	

	@GetMapping(value = "/hello")
	public ResponseEntity<String> getWelcomeMessageHandler(){
		
		return new ResponseEntity<>("Welcom to Spring Boot", HttpStatus.OK);
	}
	

	// Part-3
	
	@PutMapping(value = "/employee/{id}")
	public ResponseEntity<Employee> updateEmployeeSalaryBy1000Handler(@PathVariable("id") Integer empId){
		
		Employee savedEmployee = employeeService.updateEmployeeSalaryBy1000(empId);
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
	}
	

	@PutMapping(value = "/employee/{id}")
	public ResponseEntity<String> updateAllEmployeeSalaryBy10PercentHandler(@PathVariable("id") Integer empId){
		
		String savedEmployee = employeeService.updateAllEmployeeSalaryBy10Percent();
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.ACCEPTED);
	}
	
	
	
	// Part-4

	@DeleteMapping(value = "/employee/{id}")
	public ResponseEntity<Employee> deleteEmployeeHandler(@PathVariable Integer empId){
		
		Employee savedEmployee = employeeService.deteleEmployeeById(empId);
		
		return new ResponseEntity<>(savedEmployee, HttpStatus.ACCEPTED);
	}
	
}
