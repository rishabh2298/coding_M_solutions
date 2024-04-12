package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetAddressById {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to get address");
		int id = input.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		System.out.println(dao.getAddressOfEmployee(id));
		
		input.close();
		
	}
	
}
