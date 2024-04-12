package com.masai.question02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals = {new Dog(), new Cat(), new Tiger()};
		
		animals[0].makeNoise();
		animals[0].eat();
		animals[0].walk();
		System.out.println();
		animals[1].makeNoise();
		animals[1].eat();
		animals[2].walk();
		System.out.println();
		animals[2].makeNoise();
		animals[2].eat();
		animals[2].walk();

	}

}
