package com.masai;

import java.util.Scanner;

public class ReverseString {
	
	
	public static String reverseString(String input) {
		
		char[] str = input.toCharArray();
		String result = ""; 
		
		for(int i=str.length-1; i>=0; i--) {
			result += str[i]; 
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String to reverse : ");
		String originalString = sc.next();
		
		String result = reverseString(originalString);
		
		System.out.println("Original String is : "+originalString);
		System.out.println("Reversed String is : "+ result);
		
		sc.close();
		
	}

}
