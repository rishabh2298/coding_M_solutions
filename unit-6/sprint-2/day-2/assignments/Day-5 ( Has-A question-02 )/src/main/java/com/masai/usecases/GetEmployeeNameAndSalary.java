package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class GetEmployeeNameAndSalary {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int empId = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			Object object = dao.getEmployeeEmployeeNameAndSalary(empId);
			
			Employee emp = (Employee)object;
			
			System.out.println("Employee Name = "+emp.getName());
			System.out.println("Employee Salary = "+emp.getSalary());
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
