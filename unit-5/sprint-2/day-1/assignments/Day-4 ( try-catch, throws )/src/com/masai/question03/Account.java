package com.masai.question03;

public class Account {
	
	public String accountNumber;
	public double balance;
	
	public Account() {
		
	}
	
	public Account(String accNo, Integer amt) {
		this.accountNumber = accNo;
		this.balance = amt;
	}
	
	public void deposite(Integer amount) {
		
		this.balance += amount;
		
		System.out.println("Your current balance is = "+this.balance);
	}
	
	public double withdraw(Double amount) throws InsufficientFundsException {
		
		if(amount <= balance) {
			this.balance -= amount;
		}
		else {
			InsufficientFundsException isfe = new InsufficientFundsException("You have Insufficient balance = "+ this.balance);
			throw isfe;
		}
		return balance;
	}

}
