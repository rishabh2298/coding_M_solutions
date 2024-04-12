package com.masai.question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Test test = new Test();
		
		System.out.print("Enter number to get all prime number : ");
		int num = input.nextInt();
		
		int[] arr = test.diasplay(num);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
