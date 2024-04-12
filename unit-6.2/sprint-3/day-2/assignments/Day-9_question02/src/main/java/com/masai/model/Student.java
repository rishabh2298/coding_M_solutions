package com.masai.model;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
