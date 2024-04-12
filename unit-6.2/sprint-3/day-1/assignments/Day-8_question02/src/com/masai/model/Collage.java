package com.masai.model;

public class Collage {
	
	public Controller controller;
	
	Collage(){
		
	}
	
	Collage(Controller controller){
		this.controller = controller;
	}
	
	public void doJob() {
		System.out.println("Job is Started");
		controller.runMethod();
	}

}
