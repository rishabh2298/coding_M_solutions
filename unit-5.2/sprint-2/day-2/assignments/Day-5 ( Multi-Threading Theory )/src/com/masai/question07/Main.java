package com.masai.question07;

public class Main {
	
	public static void main(String[] args) {
		
		Thread t1 = new Common();
		Thread t2 = new Common();
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
	}

}
