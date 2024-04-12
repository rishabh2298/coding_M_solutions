package com.masai.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student {
	
	private int empId;
	private String name;
	private int salary;
	
	@Autowired
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int empId, String name, int salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
