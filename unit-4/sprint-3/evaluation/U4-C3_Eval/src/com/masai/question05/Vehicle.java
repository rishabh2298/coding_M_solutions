package com.masai.question05;

public interface Vehicle {
	
	void run();
	
	default void service() {
		System.out.println("Car needs sevice");
	}

}
