package com.masai;

public class Score {
	
	static int total_run = 0;
	
	public static void runScored(int run) {
		total_run += run;
		System.out.println("Total Score : "+total_run);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runScored(1);
		runScored(2);
		runScored(3);
		runScored(4);
		runScored(6);

	}

}
