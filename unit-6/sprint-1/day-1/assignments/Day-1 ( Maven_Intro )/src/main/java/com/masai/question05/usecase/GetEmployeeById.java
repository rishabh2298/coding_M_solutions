package com.masai.question05.usecase;

import java.util.Scanner;

import com.masai.question05.dao.DaoMethods;
import com.masai.question05.dao.DaoMethodsImpl;
import com.masai.question05.exception.EmployeeException;
import com.masai.question05.model.Employee;

public class GetEmployeeById {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = input.nextInt();
		
		DaoMethods dao = new DaoMethodsImpl();
		
		
		try {
			
			Employee employee = dao.getEmployeeById(id);
			
			System.out.println(employee);
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
		
	}
	
}
