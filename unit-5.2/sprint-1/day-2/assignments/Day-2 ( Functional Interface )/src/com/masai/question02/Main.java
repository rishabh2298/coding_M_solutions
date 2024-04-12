package com.masai.question02;

public class Main {
	
	public int copyMethod(String string) {
		
		Integer ans = Integer.parseInt(string);
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		X x1 = new Main() :: copyMethod;
		
		Integer ans = x1.convertStringToNumber("20");
		
		System.out.println(ans);
	}

}
