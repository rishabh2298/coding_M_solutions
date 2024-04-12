package com.masai.question04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Harrier","Tata","black");
		
		car.engine = new Engine();
		
		car.engine.rpm = 10000;
		car.engine.power = 110;
		car.engine.manufacturer = "tata";
		car.engine.enableTurbo();
		
		System.out.println("Car Model : "+ car.model);
		System.out.println("Car companyName : "+ car.companyName);
		System.out.println("Car color : "+ car.color);
		System.out.println("Car RPM : "+ car.engine.rpm);
		System.out.println("Car power : "+ car.engine.power);
		System.out.println("Car Engine Manufacturer : "+ car.engine.manufacturer);
		System.out.println("Car Has Turbo : "+ car.engine.hasTurbo);
		
		System.out.println("================================");
		

		Car car2 = new Car();
		
		car2.model = "Creata";
		car2.companyName = "Hyundai";
		car2.color = "White";
		car2.engine = new Engine();
		car2.engine.rpm = 11000;
		car2.engine.power = 110;
		car2.engine.manufacturer = "hyundai";
		
		System.out.println("Car Model : "+ car2.model);
		System.out.println("Car companyName : "+ car2.companyName);
		System.out.println("Car color : "+ car2.color);
		System.out.println("Car RPM : "+ car2.engine.rpm);
		System.out.println("Car power : "+ car2.engine.power);
		System.out.println("Car Engine Manufacturer : "+ car2.engine.manufacturer);
		System.out.println("Car Has Turbo : "+ car2.engine.hasTurbo);
		
		
	}

}







