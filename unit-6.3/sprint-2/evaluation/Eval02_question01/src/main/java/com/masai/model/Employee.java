package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String name;
	private int age;
	private String email;
	private String phone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.EAGER)
	private List<PaySlip> paySlips = new ArrayList<>();

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, int age, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public List<PaySlip> getPaySlips() {
		return paySlips;
	}


	public void setPaySlips(List<PaySlip> paySlips) {
		this.paySlips = paySlips;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + "]";
	}


	
}
