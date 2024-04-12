package com.masai.question05;

import java.util.Scanner;

public class Main {
	
	
	public static Employee getEmployeeDetails() {
		
		Employee employee = new Employee();
		
		return employee;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = Main.getEmployeeDetails();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter Id : ");
		int id = scanner.nextInt();
		employee.employeeId = id;
		
		
		scanner.nextLine();
		System.out.print("Enter Name : ");
		String name = scanner.nextLine();
		employee.employeeName = name;
		
		
		System.out.print("Enter Salary : ");
		double salary = scanner.nextInt();
		employee.salary = salary;
		
		
		System.out.print("Enter PF Percentage : ");
		int pfPercentage = scanner.nextInt();
		employee.caculateNetSalary(pfPercentage);
		
		
		System.out.println();
		System.out.println();
		System.out.println("Id : "+ employee.employeeId);
		System.out.println("Name : "+ employee.employeeName);
		System.out.println("Salary : "+ employee.salary);
		System.out.println("Net Salary : "+ employee.netSalary);
		System.out.println();
		System.out.println("===================================");

	}

}
