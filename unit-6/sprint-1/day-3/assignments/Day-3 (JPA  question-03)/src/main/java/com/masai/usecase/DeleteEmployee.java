package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to delete data");
		int id = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		boolean result = dao.deleteEmployee(id);
		
		if(result) {
			System.out.println("Data of employee deleted");
		}
		else {
			System.out.println("No such employee exist");
		}
		
		input.close();
		
	}

}
