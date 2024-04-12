package com.masai.question01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter an Integer : ");
			
			Integer num = Integer.parseInt(input.next());
			
			System.out.println("The square value is = "+(num*num));
			
		} catch (NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		
		System.out.println("The work has been done successfully");
	}

}
