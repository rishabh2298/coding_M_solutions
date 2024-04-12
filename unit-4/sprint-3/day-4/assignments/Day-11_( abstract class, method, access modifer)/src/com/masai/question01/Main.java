package com.masai.question01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of passengers = ");
		int numberOfPassenger = input.nextInt();
		
		System.out.print("Enter number of Kms = ");
		int numberOfKms = input.nextInt();
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		myCar.setNumberOfPassenger(numberOfPassenger);
		myCar.setNumberOfKms(numberOfKms);
		int result = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is = "+result);
		
		input.close();
		
	}

}
