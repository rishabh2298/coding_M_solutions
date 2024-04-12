package com.masai.question05;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String userName, String userCountry) throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("India")) {
		
			System.out.println("User registration done successfully");
		
		}
		else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		UserRegistration ur = new UserRegistration();
		
		try {
		
			System.out.println("Enter your Name");
			String userName = input.nextLine();
		
			System.out.println("Enter your Country Name");
			String userCountry = input.nextLine();
			
			ur.registerUser(userName, userCountry);
			
		} 
		catch (InvalidCountryException ice) {
			System.out.println(ice.getMessage());
		}
		
		System.out.println("Thank you!");
	
		input.close();
	}
	
}
