package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Raju", "Pune", 46000);
		Employee employee2 = new Employee("Hari", "Banglore", 55000);
		Employee employee3 = new Employee("Tapan", "Mumbai", 32000);
		Employee employee4 = new Employee("Shankar", "Chennai", 66000);
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		try {
			System.out.println(dao.registerEmployee(employee1));
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}

		

		try {
			System.out.println(dao.registerEmployee(employee2));
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
		
		

		try {
			System.out.println(dao.registerEmployee(employee3));
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
		
		

		try {
			System.out.println(dao.registerEmployee(employee4));
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
