package com.masai.question02;

import java.util.Scanner;

public class InsuranceAgency {
	
	static double averageAge(int[] list) {
		
		int totalAge = 0;
		
		for(int i=0; i<list.length; i++) {
			totalAge += list[i];
		}
		
		double average = totalAge/list.length;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total no of Employees :");
		int noOfEmployee = input.nextInt();
		
		if(noOfEmployee<2) {
			System.out.println("Please Enter a valid count");
		}
		else {
			int[] list = new int[noOfEmployee];
			
			System.out.println("Enter age of Employes :");
			for(int i=0; i<noOfEmployee; i++) {
				list[i] = input.nextInt(); 
			}
			input.close();
			
			double result = averageAge(list);
			System.out.println("The average age is = "+result);
		}
		
	}

}
