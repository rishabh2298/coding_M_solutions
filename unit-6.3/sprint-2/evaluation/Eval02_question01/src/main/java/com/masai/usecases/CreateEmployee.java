package com.masai.usecases;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.masai.dao.MasaiDao;
import com.masai.dao.MasaiDaoImpl;
import com.masai.model.Employee;
import com.masai.model.Month;
import com.masai.model.PaySlip;

public class CreateEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter Employee Name");
		String name = scanner.next();
		
		System.out.println("Enter Employee age");
		int age = scanner.nextInt();
		
		System.out.println("Enter Email");
		String email = scanner.next();
		
		System.out.println("Enter phone");
		String phone = scanner.next();
		
		
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setAge(age);
		employee.setEmail(email);
		employee.setPhone(phone);
		
		
		// payslip
		System.out.println("Enter payslip details");
		
		
		System.out.println("Enter month");
		String month = scanner.next();
		
		System.out.println("Enter Salary");
		int salary = scanner.nextInt();
		
		
		
		PaySlip paySlip = new PaySlip();
		
		paySlip.setCreatedAt(LocalDateTime.now());

		// enum check 
		paySlip.setMonth(Month.valueOf(month.toUpperCase()));
		
		paySlip.setSalay(salary);
		
		
		// assosiation with each other
		paySlip.setEmployee(employee);
		employee.getPaySlips().add(paySlip);
		
		
		
		MasaiDao dao = new MasaiDaoImpl();
		
		dao.createEmployee(employee);		
		
		
		scanner.close();
	
	}
	
}
