package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select e from Employee e where e.name = :empName and e.salary = :empSalary", name = "findEmployeeByNameAndSalary")
@NamedQuery(query = "select e from Employee e where e.empId = :id", name = "findEmployeeById")
//@NamedNativeQuery(query = "delete from Employee e where e.empId = :id", resultClass = Employee.class, name="deleteEmployeeById")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
