package com.masai.dao;

import java.util.List;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
	
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException;
	
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException;
	
	public int getEmplooyeeSalaryById(int empId) throws EmployeeException;

}
