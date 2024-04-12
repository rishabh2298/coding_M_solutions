package com.masai.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name = "empName")
	private String name;
	
	private String gender;
	
	private int salary;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state", column = @Column(name="home_state")),
		@AttributeOverride(name = "city", column = @Column(name="home_city")),
		@AttributeOverride(name = "pincode", column = @Column(name="home_pincode"))
	})
	private Address homeAddress;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state", column = @Column(name="office_state")),
		@AttributeOverride(name = "city", column = @Column(name="office_city")),
		@AttributeOverride(name = "picode", column = @Column(name="office_pincode"))
	})
	private Address officeAddress;

	
	
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}

	
}
