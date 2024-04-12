package com.masai.question03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan loan = Loan.getLoanObject();

		PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Name1", 1000);
		permanentEmployee.calculateSalary();
		
		double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);


		TemporaryEmployee temporaryEmployee = new TemporaryEmployee(2, "Name2", 20, 100);
		temporaryEmployee.calculateSalary();
		
		double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);
		
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
	}

}
