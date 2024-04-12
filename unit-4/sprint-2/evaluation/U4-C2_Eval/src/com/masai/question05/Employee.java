package com.masai.question05;

public class Employee {
	
	
	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	
	public void caculateNetSalary(int pfPercentage) {
		
		this.netSalary =  this.salary-((pfPercentage*this.salary)/100);
		
	}
	

}
