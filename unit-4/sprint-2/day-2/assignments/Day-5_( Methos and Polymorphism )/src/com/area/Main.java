package com.area;

public class Main {
	
	public void area(Circle circle, int r) {
		circle.area(r);
	}
	
	public void area(Rectangle rectangle, int length, int breadth) {
		rectangle.area(length, breadth);
	}
	
	public void area(Square square, int side) {
		square.area(side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main shapes = new Main();
		
		shapes.area(new Circle(), 10);
		shapes.area(new Rectangle(), 40 , 15);
		shapes.area(new Square(), 8);
		
	}

}
