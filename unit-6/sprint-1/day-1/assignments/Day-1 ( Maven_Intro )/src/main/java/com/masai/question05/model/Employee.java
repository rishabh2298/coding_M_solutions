package com.masai.question05.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class Employee {

	@Id
	@Column(name = "EmployeeId")
	private int id;
	
	@Column(name = "EmployeeName")
	private String name;
	
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
