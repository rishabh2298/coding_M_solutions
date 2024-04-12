package com.masai.question03;

public class Cycle implements Vehicle {
	
	public Cycle() {
		
	}
	
	public void runCycle() {
		System.out.println("Man is using Cycle");
	}

	@Override
	public void runVehicle() {
		runCycle();
	}
		

}
