package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empGen")
	@SequenceGenerator(name = "empGen", sequenceName = "Generator", initialValue = 150, allocationSize = 5)
	private int empId;
	private String name;
	private String gender;
	private int salary;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "emp_addr", joinColumns = @JoinColumn(name="employee_Id"))
	private Set<Address> addresses = new HashSet<>();

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", addresses=" + addresses + "]";
	}

}
