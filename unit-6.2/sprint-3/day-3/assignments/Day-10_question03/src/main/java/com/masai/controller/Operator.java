package com.masai.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.model.Student;
import com.masai.service.StudentService;

@Controller
public class Operator {
	
	@Autowired
	private StudentService dao;

	public void addStudent() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Student Roll No");
		int roll = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter Student Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Student address");
		String address = scanner.nextLine();
		
		System.out.println("Enter Student Marks");
		int marks = scanner.nextInt();
		
		
		String message = dao.addStudent(new Student(roll, name, address, marks));
		
		System.out.println(message);
		
		scanner.close();
	}
	
	
	public void getStudent() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Student Roll No.");
		int roll = scanner.nextInt();
		
		
		Student student = dao.getStudent(roll);
		
		System.out.println(student);
	
		scanner.close();
	}
	
}




