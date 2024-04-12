package com.masai.question02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number of Student you want to enter : ");
		int details = scanner.nextInt();
		
		for(int i=1; i<=details; i++) {
		
			System.out.print("Enter Roll Number : ");
			int rollNumber = scanner.nextInt();
			
			
			scanner.nextLine();
			System.out.print("Enter the Name : ");
			String studentName = scanner.nextLine();
			
			
			System.out.print("Enter the Marks : ");
			int marks = scanner.nextInt();
			
			
			System.out.println();
			System.out.println("Student Details : "+ i);
			
			Student student = new Student(rollNumber,studentName,marks);
			
			System.out.println("Student Roll Number : "+ student.getRollNumber());
			System.out.println("Student Name : "+ student.getStudentName());
			System.out.println("Student Marks : "+ student.getMarks());
			System.out.println("=========================================");
			System.out.println();
		}
		
	}

}
