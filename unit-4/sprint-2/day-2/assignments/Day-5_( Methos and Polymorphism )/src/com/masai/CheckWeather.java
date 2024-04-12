package com.masai;

public class CheckWeather {
	
	void result(boolean snow, boolean rain, double temp) {
		if(snow || rain  || temp<50) {
			System.out.println("Let's stay home");
		}
		else {
			System.out.println("Let's go out!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		
		CheckWeather w1 = new CheckWeather();
		w1.result(isSnowing, isRaining, temperature);
	}

}
