package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetEmployeeSalaryById {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empId = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			int salary = dao.getEmployeeSalaryById(empId);
			
			System.out.println("Salary of Employee with id "+empId+" is "+ salary);
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
	}

}
