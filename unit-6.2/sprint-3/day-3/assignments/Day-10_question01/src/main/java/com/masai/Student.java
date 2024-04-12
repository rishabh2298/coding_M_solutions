package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class Student {
	
	private int rollNo;
	private String name;
	private int marks;
	
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
	
	@PostConstruct
	public void setUp() {
		System.out.println("This is inside setUp method (Post Construct)");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is inside destroy method (Pre Destroy)");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}
