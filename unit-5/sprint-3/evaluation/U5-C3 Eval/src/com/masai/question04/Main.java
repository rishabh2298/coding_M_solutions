package com.masai.question04;

import java.util.EnumSet;

import javax.print.attribute.IntegerSyntax;

public class Main {
	
	static void kohli(int... nums) {
		rohit(nums);
		System.out.print("This is Kohli first 10 nums => ");
		for(int i=0; i<10; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	static void dhoni(int... nums) {
		int addition = 0;
		for(int i=0; i<20; i++) {
			addition += nums[i];
		}
		System.out.println("This is Dhoni Addition =>"+addition);
	}
	
	static void rohit(int... nums) {
		dhoni(nums);
		int product = 1;
		for(int i=0; i<10; i++) {
			product *= nums[i];
		}
		System.out.println("This is Rohit products => "+product);
	}

	public static void main(String[] args) {
		
		kohli(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

	}

}
