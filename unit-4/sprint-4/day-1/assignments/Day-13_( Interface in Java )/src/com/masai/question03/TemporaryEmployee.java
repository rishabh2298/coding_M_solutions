package com.masai.question03;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		super.salary = this.hoursWorked * this.hourlyWages;
	}
	
}
