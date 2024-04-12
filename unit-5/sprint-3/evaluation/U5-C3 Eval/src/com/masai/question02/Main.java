package com.masai.question02;

public class Main {
	
	static int productUptoLimit(int... nums) {
		int product = 1;
		
		for(int i=0; i<nums.length; i++) {
			product *= nums[i];
		}
		
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = productUptoLimit(1,2,3,4,5,6,7,8,9,10);
		System.out.println(ans);
		
	}

}
