package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonusToEmployee {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Id to give Bouns");
		int id = scanner.nextInt();
		
		System.out.println("Enter bounus amount");
		int bounus = scanner.nextInt();
		
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		System.out.println(dao.giveBonusToEmployee(id, bounus));
		
		scanner.close();
		
	}

}
