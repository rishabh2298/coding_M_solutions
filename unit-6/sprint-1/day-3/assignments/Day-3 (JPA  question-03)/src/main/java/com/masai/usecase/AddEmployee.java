package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class AddEmployee {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee name");
		String name = input.next();
		
		input.nextLine();
		System.out.println("Enter employee address");
		String address = input.nextLine();
		
		System.out.println("Enter employee salary");
		int salary = input.nextInt();
		
		Employee employee = new Employee(name, address, salary);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		dao.save(employee);
		
		input.close();

	}

}
