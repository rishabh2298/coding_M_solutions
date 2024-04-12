package com.masai.model;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String mobile;
	private String email;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, String mobile, String email, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobile=" + mobile + ", email=" + email
				+ ", salary=" + salary + "]";
	}

}
