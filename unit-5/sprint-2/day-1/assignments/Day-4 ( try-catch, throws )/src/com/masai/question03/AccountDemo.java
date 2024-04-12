package com.masai.question03;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("12345", 500);
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("For balance Enquery press 1");
			System.out.println("For depositing money press 2");
			System.out.println("For withdrawl money press 3");
			
			System.out.println("Enter your choice :");
			int choice = input.nextInt();
			
				switch (choice) {
				case 1: {
					System.out.println("Your Current balance = "+account.balance);
				}
				break;
				
				case 2: {
					System.out.println("Enter amount for deposite : ");
					account.deposite(input.nextInt());
				}
				break;
				
				case 3: {
					try {
						
						System.out.println("Enter amount to withdraw :");
						Double value = input.nextDouble();
						
						double remainBalance = account.withdraw(value);
						
						System.out.println("Remain Balace = "+remainBalance);
						
					} 
					catch (InsufficientFundsException isfe) {
						isfe.printStackTrace();;
					}
				}
				break;
				
				default:{
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				}
			}
			catch (IllegalArgumentException iae) {
				iae.printStackTrace();;
			}
			
		System.out.println("All Procedure is completed");
		input.close();
	}

}
