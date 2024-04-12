package com.masai.question04;

public class Test implements Intr {
	
	public boolean checkPrime(int num) {
		if(num==2)
			return true;
		
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				count++;
		}
		if(count>0)
			return false;
		else 
			return true;
	}

	@Override
	public int[] diasplay(int p) {
		int size = 0;
		String string = "";
	
		for(int i=2; i<=p; i++) {
			boolean result = checkPrime(i);
			if(result) {
				size++;
				string += i+" ";
			}
		}
		
		int[] arr = new int[size];
		String[] str = string.split(" ");
		
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(str[i]); 
		}
		
		return arr;
	}

}
