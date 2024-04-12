package com.masai.question05;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuelCar fCar = new FuelCar();
		fCar.run();
		
		ElectricCar eCar = new ElectricCar();
		eCar.run();

		fCar.service();
		eCar.service();
		
	}

}
