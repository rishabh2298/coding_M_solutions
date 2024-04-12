package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to detele data");
		int empId = scanner.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();

		if(dao.deleteEmployee(empId)) {
			System.out.println("Data deleted successfully");
		}
		else {
			System.out.println("No such Employee exist");
		}
		
		scanner.close();
		
	}
	
}
