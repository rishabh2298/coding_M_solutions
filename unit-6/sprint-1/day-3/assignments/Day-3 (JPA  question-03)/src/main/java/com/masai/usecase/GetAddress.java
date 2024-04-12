package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetAddress {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee ID to get address");
		int empId = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String message = dao.getAddressOfEmployee(empId);
		
		System.out.println(message);
		
		input.close();
	}
	
}
