package com.masai.model;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle {

	public void fun1() {
		System.out.println("inside fun1 of Car class");
	}

	@Override
	public void runVehicle() {
		fun1();
	}
	
}
