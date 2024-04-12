package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class UpdateSalary {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee new Salary");
		int salary = sc.nextInt();
		
		
		
		
		EmployeeDao  dao = new EmployeeDaoImpl();
		
		try {
			
			System.out.println(dao.updateEmployeeSalary(id, salary));
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
		
	}
	
}
