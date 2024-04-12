package com.masai.question01;

public class Demo extends ZImpl {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Demo is playing");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Demo is fighting");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Demo is Driving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x = new Demo();
		
		x.run();
		x.eat();
		x.sleep();
	
		Y y = (Y)x;
		y.play();
		y.drive();
		y.fight();
		
		Z z = (Z)x;
		z.whoIsHero();
	}
}
