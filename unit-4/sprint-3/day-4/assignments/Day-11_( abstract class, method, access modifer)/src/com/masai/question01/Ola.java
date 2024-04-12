package com.masai.question01;

public class Ola {
	
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		
		if(numberOfPassenger<=3) {
			return new HatchBack();
		}
		else {
			return new Sedan();
		}
		
	}
	
	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			HatchBack hb = (HatchBack)car;
			int totalFare = hb.getNumberOfKms()*hb.farePerKm;
			return totalFare;
		}
		else {
			Sedan sd = (Sedan)car;
			int totalFare = sd.getNumberOfKms()*sd.farePerKm;
			return totalFare;
		}
	}

}
