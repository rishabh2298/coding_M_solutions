package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class DeleteEmployeeById {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empId = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			Employee employee = dao.deleteEmployeeById(empId);
			
			System.out.println("Employee = "+employee+" is deleted from database");
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
