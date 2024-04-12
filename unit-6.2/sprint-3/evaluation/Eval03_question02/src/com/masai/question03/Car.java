package com.masai.question03;

public class Car implements Vehicle{
	
	public Car() {
		
	}
	
	public void runCar() {
		System.out.println("Car is Running");
	}

	@Override
	public void runVehicle() {
		runCar();
	}
	
}
