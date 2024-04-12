package com.masai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select e from Employee e where e.address= :empAddress", name = "GetEmployeeByAddress")
@NamedNativeQuery(query = "select * from employee where salary Between :start AND :end", resultClass = Employee.class, name = "SalaryInRange")
@NamedQuery(query = "select e from Employee e where empId = :id", name = "GetEmployeeById")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@Column(name = "empName")
	private String name;
	
	private String address;
	
	private int salary;

	public Employee() {
		
	}
	
	public Employee(String name, String address, int salary) {
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
