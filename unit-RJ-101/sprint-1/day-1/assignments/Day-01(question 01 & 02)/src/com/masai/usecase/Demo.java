package com.masai.usecase;

import java.util.Scanner;

import com.masai.model.Student;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is Student from NIT(true/false)");
		boolean choice = sc.nextBoolean();
		
		Student resultStudent = Student.getStudent(choice);
		
		System.out.println();
		System.out.println("Student Details :");
		System.out.println("=================");
		System.out.println("Student Roll="+resultStudent.getRoll());
		System.out.println("Student Name="+resultStudent.getName());
		System.out.println("Student Address="+resultStudent.getAddress());
		System.out.println("Student Collage="+resultStudent.getCollageName());
		
		sc.close();
	}

}
