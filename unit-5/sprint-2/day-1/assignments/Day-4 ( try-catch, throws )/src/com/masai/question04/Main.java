package com.masai.question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 numbers : ");
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(b>0) {
				double result = a/b;
				System.out.println("Result = "+result);
			}
			else {
				throw new ArithmeticException("DivideByZero Exception caught");
			}
		} 
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("Inside Finally Block");
		}
	}

}
