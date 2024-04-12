package com.masai.model;

public class Teacher implements Controller {

	public void teaches() {
		System.out.println("Teacher teaches");
	}

	@Override
	public void runMethod() {
		teaches();
	}
	
}
