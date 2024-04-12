package com.masai.model;

import org.springframework.stereotype.Service;

@Service("hayabuza")
public class Bike implements Vehicle {

	public void fun2() {
		System.out.println("inside fun2 method of Bike Class");
	}

	@Override
	public void runVehicle() {
		fun2();
	}
	
}
