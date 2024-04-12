package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class GetEmployeeInRange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter minimum salary");
		int start = input.nextInt();
		
		System.out.println("Enter maximum salary");
		int end = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> list = dao.getAllEmployeeWithRangeSalary(start, end);
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
}
