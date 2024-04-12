package com.masai.question03;

public class Member {
	
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println("Salary of "+this+" => "+this.salary);
	}

}
