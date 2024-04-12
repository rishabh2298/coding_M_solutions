package com.masai.question05.dao;

import com.masai.question05.exception.EmployeeException;
import com.masai.question05.model.Employee;

public interface DaoMethods {
	
	public String registerEmployee(Employee employee) throws EmployeeException;
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
}