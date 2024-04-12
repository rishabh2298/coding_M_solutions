package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeNotFoundException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	
	
	private EmployeeRepository employeeRepository;
	
	
	
	@Override
	public Employee addNewEmployee(Employee employee) throws EmployeeNotFoundException {
		
		employeeRepository.findById(employee.getEmpId()).orElseThrow(() -> new EmployeeNotFoundException("This Employee already exist"));

		return employeeRepository.save(employee);
	}
	

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeNotFoundException {

		return employeeRepository.findById(empId).orElseThrow(() -> new EmployeeNotFoundException("No such employee with this Id exist..."));
	}

	
	@Override
	public List<Employee> getTop5Employees() throws EmployeeNotFoundException {
		
		return employeeRepository.findTop5ByEmpId();
	}
	

	@Override
	public Employee updateEmployeeSalaryBy1000(Integer empId) throws EmployeeNotFoundException {
		
		Employee employee = employeeRepository.findById(empId).orElseThrow(() -> new EmployeeNotFoundException("No such employee with this Id exist..."));
		
		employee.setSalary(employee.getSalary()+1000);
		
		
		return employeeRepository.save(employee);
	}

	
	@Override
	public String updateAllEmployeeSalaryBy10Percent() throws EmployeeNotFoundException {
		
		List<Employee> employeeList = employeeRepository.findAll();

		if(employeeList.isEmpty()) throw new EmployeeNotFoundException("No employee found in Database");
		
		employeeList.forEach(employee -> {
			employee.setSalary((int)(employee.getSalary()*1.1));
		});
		
		return "All employees salary has been increased by 10%";
	}

	
	@Override
	public Employee deteleEmployeeById(Integer empId) throws EmployeeNotFoundException {
		
		Employee employee = employeeRepository.findById(empId).orElseThrow(() -> new EmployeeNotFoundException("No such employee found with this Id...."));
		
		employeeRepository.delete(employee);
		
		return employee;
	}

}
