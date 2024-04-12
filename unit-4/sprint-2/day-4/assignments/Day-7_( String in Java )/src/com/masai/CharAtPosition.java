package com.masai;

import java.util.Scanner;

public class CharAtPosition {
	
	static void findIndex(String string, int index) {
		char value = string.charAt(index);
		System.out.println("The character at index "+index+" is = "+value);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String string = scanner.nextLine();
		
		System.out.println();
		System.out.print("Enter the Character position you want to access : ");
		int index = scanner.nextInt();
		
		findIndex(string, index);
		scanner.close();
		
	}

}
