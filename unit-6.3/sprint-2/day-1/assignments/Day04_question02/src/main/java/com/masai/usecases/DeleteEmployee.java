package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to delete");
		int id = sc.nextInt();
		
	
		
		
		
		EmployeeDao  dao = new EmployeeDaoImpl();
		
		try {
			
			System.out.println(dao.deleteEmployeeById(id));
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
	}
	
}
