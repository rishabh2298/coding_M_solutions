package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDao {
	
	public Employee saveEmployee(Employee employee) throws EmployeeException;
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public Employee deleteEmployeeById(int empId) throws EmployeeException;

	public Employee updateEmployeeSalary(int empId, int salary) throws EmployeeException;
	
}
