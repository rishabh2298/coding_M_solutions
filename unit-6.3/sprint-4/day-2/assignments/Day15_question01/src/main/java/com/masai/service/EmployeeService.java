package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeNotFoundException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	// part-1
	
	public Employee addNewEmployee(Employee employee) throws EmployeeNotFoundException;
	
	
	// part-2
	
	public Employee getEmployeeById(Integer empId) throws EmployeeNotFoundException;
	
	public List<Employee> getTop5Employees() throws EmployeeNotFoundException;

	
	// part-3
	
	public Employee updateEmployeeSalaryBy1000(Integer empId) throws EmployeeNotFoundException;
	
	public String updateAllEmployeeSalaryBy10Percent() throws EmployeeNotFoundException;
	
	
	// part-4
	
	public Employee deteleEmployeeById(Integer empId) throws EmployeeNotFoundException;
	
}
