package com.masai.question02;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String address;
	private int salary;
	
	
	public Employee(int employeeId, String employeeName, String address, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", salary=" + salary + "]"+ "\n";
	}
	
}
