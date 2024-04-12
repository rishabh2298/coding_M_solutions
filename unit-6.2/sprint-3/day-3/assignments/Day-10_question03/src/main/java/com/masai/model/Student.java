package com.masai.model;

import org.springframework.stereotype.Service;

@Service
public class Student {

	private int rollNo;
	private String name;
	private String address;
	private int marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String address, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
}
