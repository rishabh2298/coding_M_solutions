package com.masai.model;

public class Main {
	
	public static void main(String[] args) {
		
		Collage teacher = new Collage(new Teacher());
		teacher.doJob();
		
		System.out.println("======================");
		
		Collage clerk = new Collage(new Clerk());
		clerk.doJob();
	}

}
