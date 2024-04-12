package com.masai.question03;

public class Bus implements Vehicle {
	
	public Bus() {
		
	}
	
	public void runBus() {
		System.out.println("Bus is Running");
	}

	@Override
	public void runVehicle() {
		runBus();
	}
	
	
}
