package com.masai.question03;

public class Loan {
	
	private Loan() {
		
	}
	
	public static Loan getLoanObject() {
		return new Loan();
	}

	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount;
		if(employeeObj instanceof PermanentEmployee) {
			loanAmount = 0.15 * employeeObj.salary;
			return loanAmount;
		}
		else if(employeeObj instanceof TemporaryEmployee){
			loanAmount = 0.10 * employeeObj.salary;
			return loanAmount;
		}
		return 0;
	}
	
}
