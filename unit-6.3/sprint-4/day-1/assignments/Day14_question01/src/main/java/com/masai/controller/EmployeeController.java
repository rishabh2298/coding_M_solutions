package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

@RestController
public class EmployeeController {

	// part-1
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployeeHandler(@RequestBody Employee employee) {
		
		// save data in DB
		
		return employee;
	}
	
	
	// part-2
	
	
	@GetMapping("/employee")
	public Employee getEmployeeDetails() {

		return new Employee(33, "Hari", "45684 99830", "hari@gmail.com", 32000);
		
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getEmployeesListHandler(){
		
		return Arrays.asList(
				new Employee(11, "Rajes", "11111 22222", "rajes@gmail.com", 44000),
				new Employee(12, "Raj", "13543 54444", "raj@gmail.com", 12000),
				new Employee(13, "Suresh", "24324 33242", "suresh@gmail.com", 345000),
				new Employee(14, "Shital", "33493 44354", "shital@gmail.com", 46500),
				new Employee(15, "anjali", "98331 99022", "anjali@gmail.com", 33500)
				);
				
	}
	
	
	@GetMapping("/hello")
	public String getMessageHandler() {
		
		return "Welcom to Spring Boot";
	}
	
	
	
	//part-3
	
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeSalaryById(@PathVariable Integer empId) {
		
		// find employee by id
		
		Employee existedEmployee = new Employee();
		
		existedEmployee.setSalary(existedEmployee.getSalary()+1000);
		
		// save employee to DB
		
		return existedEmployee;
	}
	
	
	
	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployeeByIdHandler(@PathVariable Integer empId) {
		
		// find employee by id
		 
		Employee existedEmployee = new Employee();
		
		// delete this employee
		
		return existedEmployee;
	}












}


