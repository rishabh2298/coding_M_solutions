package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(query = "select e from employee e where e.address = :empAddress", name ="find employee by address"),
	@NamedQuery(query = "select e from employee where e.empId = :id", name = "get employee by id")
})
@NamedNativeQueries({
	@NamedNativeQuery(query = "select * from employee where salary between :start and :end", resultClass = Employee.class, name = "get employee between salary in range")
})
public class Employee {
	
	@Id
	private int empId;
	private String name;
	private String address;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, int salary) {
		super();
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
