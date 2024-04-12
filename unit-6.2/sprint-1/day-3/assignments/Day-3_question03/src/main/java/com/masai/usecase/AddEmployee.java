package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Employee Address");
		String address = scanner.nextLine();
		
		System.out.println("Enter Employee Salary");
		int salary = scanner.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		dao.save(new Employee(name, address, salary));
		
		scanner.close();

	}

}
