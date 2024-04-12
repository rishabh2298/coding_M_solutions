package com.masai.model;

public class Clerk implements Controller {
	
	public void registerStudent() {
		System.out.println("Enroll the Student in Collage");
	}

	@Override
	public void runMethod() {
		registerStudent();
	}

}
