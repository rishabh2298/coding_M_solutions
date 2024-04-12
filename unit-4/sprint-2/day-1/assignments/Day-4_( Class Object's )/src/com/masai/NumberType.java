package com.masai;

public class NumberType {
	
	void identify(int num) {
		if(num>=0) {
			if(num%2==0) {
				int value = (int)(10-(num%10));
				value +=num;
				System.out.println("Input:"+num+" Output:"+value);
			}
			else {
				System.out.println("Input:"+num+" Output:"+num);
			}
		}
		else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberType n1 = new NumberType();
		n1.identify(44);
		n1.identify(45);
		n1.identify(-5);
	}

}
