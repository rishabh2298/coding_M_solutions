package com.masai.question03;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {

		double pfAmount = this.basicPay*0.12;
		
		super.salary = this.basicPay - pfAmount;
	}
	
	
}
