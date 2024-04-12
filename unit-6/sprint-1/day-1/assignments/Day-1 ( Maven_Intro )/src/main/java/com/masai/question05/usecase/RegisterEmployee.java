package com.masai.question05.usecase;

import java.util.Scanner;

import com.masai.question05.dao.DaoMethods;
import com.masai.question05.dao.DaoMethodsImpl;
import com.masai.question05.exception.EmployeeException;
import com.masai.question05.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter employee name");
		String name = input.nextLine();
		
		System.out.println("Enter employee salary");
		Double salary = input.nextDouble();
		
		Employee employee = new Employee();
		
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		
		DaoMethods dao = new DaoMethodsImpl();
		
		try {
			
			String message = dao.registerEmployee(employee);
			
			System.out.println(message);
			
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
			
		}
		
		input.close();
	}

}
