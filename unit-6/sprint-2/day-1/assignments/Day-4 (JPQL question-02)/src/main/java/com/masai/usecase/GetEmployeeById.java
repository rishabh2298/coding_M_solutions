package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class GetEmployeeById {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee Id");
		int empId = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			
			Employee employee = dao.getEmployeeById(empId);
			
			System.out.println(employee);
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
}
