package com.masai.model;

import java.util.Scanner;

public class Student {
	
	private Integer roll;
	private String name;
	private String address;
	private String collageName;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	// for NIT
	public Student(Integer roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	// for Non-NIT
	public Student(Integer roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}

	
	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	

	public static Student getStudent(boolean isFromNIT) {
		
		Scanner sc = new Scanner(System.in);
		
		if(isFromNIT==true) {
			System.out.println("Enter Student Roll :");
			Integer roll = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Student Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Student Address :");
			String address = sc.nextLine();
			
			Student student = new Student(roll, name, address);
			student.setCollageName("NIT");
			
			sc.close();
			
			return student;
			
		}
		else {
			System.out.println("Enter Student Roll :");
			Integer roll = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Student Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Student Address :");
			String address = sc.nextLine();
			
			System.out.println("Enter Student Collage Name :");
			String collage = sc.nextLine();
			
			
			Student student = new Student(roll, name, address, collage);
			
			sc.close();
			
			return student;
			
		}
	
	}
	
}
