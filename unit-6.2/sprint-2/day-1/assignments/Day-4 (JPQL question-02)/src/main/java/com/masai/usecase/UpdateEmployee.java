package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class UpdateEmployee {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empId = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Employee Name");
		String empName = input.nextLine();
		
		System.out.println("Enter Employee Address");
		String empAddress = input.nextLine();
		
		System.out.println("Enter Employee Salary");
		int empSalary = input.nextInt();
		
		Employee employee = new Employee(empName, empAddress, empSalary);
		employee.setEmpId(empId);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			Employee employee2 = dao.updateEmployee(employee);
			
			System.out.println(employee2);
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
