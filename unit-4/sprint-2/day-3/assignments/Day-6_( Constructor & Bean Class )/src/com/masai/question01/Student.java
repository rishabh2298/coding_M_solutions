package com.masai.question01;

public class Student {

	private int rollNumber;
	private String name;
	private int age;
	private int marks;
	
	
	Student(){
		
	}
	
	
	Student(int rollNumber, String name, int age, int marks){
		this.rollNumber = rollNumber;
		this.name = name;
		if(age>18 && age<60) {
			this.age = age;
		}
		else {
			System.out.println("Invalid Age Group");
		}
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid Marks Range");
		}
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
		else {
			System.out.println("Invalid Age");
		}
	}
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid Marks Range");
		}
	}
	
	
}
