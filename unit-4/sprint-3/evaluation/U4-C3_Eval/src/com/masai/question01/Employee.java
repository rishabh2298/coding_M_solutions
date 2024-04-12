package com.masai.question01;

public class Employee {

	
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int salary) {
		setId(id);
		setName(name);
		setSalary(salary);
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
