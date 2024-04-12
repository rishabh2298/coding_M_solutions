package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee Id");
		int id = input.nextInt();
		
		System.out.println("Enter bonus amount");
		int bounus = input.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String message = dao.giveBonusToEmployee(id, bounus);
		
		System.out.println(message);
		
		input.close();
		
	}
	
}
