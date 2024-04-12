package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String address;
	private int cgpa;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String email, String address, int cgpa) {
		super();
		this.email = email;
		this.address = address;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", address=" + address + ", cgpa=" + cgpa + "]";
	}

}
