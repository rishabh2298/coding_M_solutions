package com.masai.question02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public String result(String dob) throws Exception {
		
		LocalDate ld = LocalDate.parse(dob,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate currDate = LocalDate.now();
		
		if(ld.isAfter(currDate)) {
			return ("Date should not be in Future");
		}
		else if(ld.isBefore(currDate)) {
			Long ans = (ChronoUnit.YEARS.between(ld,currDate));
			String s = Long.toString(ans);
			return ("age of user => "+s+"years old");
		}
		else {
			Exception e = new Exception();
			throw e;
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter your date of birth (yyyy-MM-dd) : ");
			String dob = input.next();

			Main m = new Main();
			
			String ans = m.result(dob);
			
			System.out.println(ans);
		}catch (Exception e) {
			System.out.println("Please enter the date in correct format");
		}
		System.out.println("End of main");
	}

}
