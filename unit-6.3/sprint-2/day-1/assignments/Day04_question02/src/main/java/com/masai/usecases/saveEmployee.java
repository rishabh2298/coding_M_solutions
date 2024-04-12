package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class saveEmployee {
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		
		employee.setEmpName("Hari Kishan");
		employee.setAddress("Pune, Adarsh Nagar");
		employee.setEmail("hari@gmail.com");
		employee.setSalary(32000);
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		try {
			
			System.out.println(dao.saveEmployee(employee));
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
	}

}
