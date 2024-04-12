package com.masai.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String name;
	private String gender;
	private int salary;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="EMP_ADDRESS", joinColumns = @JoinColumn(name = "EMP_ID"))
	private Set<Address> empAddresses = new HashSet<>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getEmpAddresses() {
		return empAddresses;
	}

	public void setEmpAddresses(Set<Address> empAddresses) {
		this.empAddresses = empAddresses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

}
