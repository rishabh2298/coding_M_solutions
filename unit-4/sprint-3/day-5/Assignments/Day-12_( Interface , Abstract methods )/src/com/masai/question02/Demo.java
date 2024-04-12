package com.masai.question02;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>1000)
				return new TajHotel();
		else if(amount>=200 && amount<=1000)
				return new RoadSideHotel();
		else {
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount = ");
		int amount = input.nextInt();
		
		Demo demo = new Demo();
		
		Hotel hotel = demo.provideFood(amount);
		
		if(hotel!=null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
			if(hotel instanceof TajHotel) {
				TajHotel tajHotel = (TajHotel)hotel;
				tajHotel.welcomeDrink();
			}
		}
		else {
			System.out.println("Please Enter a Valid Amount.");
		}
		input.close();
	}

}
