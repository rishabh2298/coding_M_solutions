package com.masai.question05;

import java.util.Scanner;

public class Demo {
	
	
	static void printDetails(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println("Details of Student "+ i+1);
			System.out.println("Roll Number ="+ students[i].getRoll());
			System.out.println("Name of Student ="+ students[i].getName());
			System.out.println("Address of Student ="+ students[i].getAddress());
			System.out.println("Marks of Student ="+ students[i].getMarks());
			System.out.println("===================");
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many Student objects need to be created : ");
		int noOfObjects = scanner.nextInt();
		
		Student[] students = new Student[noOfObjects];
		
		int totalMarks = 0;
		
		for(int i=0; i<students.length; i++) {
			
			students[i] = new Student();
			
			System.out.println("Enter Details of Student "+(i+1));
			
			System.out.print("Enter Student Roll Number : ");
			int roll = scanner.nextInt();
			students[i].setRoll(roll);
			
			scanner.nextLine();
			System.out.print("Enter Student Name : ");
			String name = scanner.nextLine();
			students[i].setName(name);
			
			System.out.print("Enter Student Address : ");
			String address = scanner.nextLine();
			students[i].setAddress(address);
			
			System.out.print("Enter Student Marks : ");
			int marks = scanner.nextInt();
			students[i].setMarks(marks);
			
			System.out.println();
			
			totalMarks += marks;
		
		}
		scanner.close();
		
		System.out.println("Average Marks of All Students are ="+ (totalMarks/students.length));
		System.out.println();
		
		printDetails(students);
		
	}

}
