package com.masai.question04;

public class Bank {
	
	static Bank getObject() {
		return new Bank();
	}

	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}
	
}
