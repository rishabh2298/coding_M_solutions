package com.masai.question04;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	public void displayDetails() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter roll number = ");
		int roll = input.nextInt();
		
		input.nextLine();
		System.out.print("Enter name = ");
		String name = input.nextLine();
		
		System.out.print("Enter marks = ");
		int enterMarks = input.nextInt();
		
//		input.close();
		
		Student student = new Student(roll, name, marks, calculateGrade(enterMarks));
		
		System.out.println(student);
	}
	
	private char calculateGrade(int mark) {
		char result;
		if(mark>=500) {
			result = 'A';
		}
		else if(mark<500 && mark>=400) {
			result = 'B';
		}
		else {
			result = 'C';
		}
		return result;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
}
