package com.masai.question06;

import java.util.Scanner;

public class Main {
	
	
	public static double getStudent (int choice) {

		Scanner scanner = new Scanner(System.in);
		
		if(choice==1) {
			ArtStudent aStudent = new ArtStudent();
			
			System.out.print("Enter Marks for Hindi : ");
			int hindi = scanner.nextInt();
			aStudent.setHindiMarks(hindi);
			
			System.out.print("Enter Marks for English : ");
			int english = scanner.nextInt();
			aStudent.setEnglishMarks(english);
			
			System.out.print("Enter Marks for History : ");
			int history = scanner.nextInt();
			aStudent.setHistoryMarks(history);
			
			return aStudent.findPercentage(); 
		}
		else if(choice==2){
			ScienceSudent scienceSudent = new ScienceSudent();
				
			System.out.print("Enter Marks for Physics : ");
			int physic = scanner.nextInt();
			scienceSudent.setPhysicsMarks(physic);
				
			System.out.print("Enter Marks for Chemistry : ");
			int chemistry = scanner.nextInt();
			scienceSudent.setChemistryMarks(chemistry);;
				
			System.out.print("Enter Marks for Maths : ");
			int maths = scanner.nextInt();
			scienceSudent.setMathsMarks(maths);
			
			System.out.print("Enter Marks for Biology : ");
			int biology = scanner.nextInt();
			scienceSudent.setBiologyMarks(biology);
			
			return scienceSudent.findPercentage(); 
			
		}
		else if(choice==3) {
			CommerceStudent commerceStudent = new CommerceStudent();
			
			System.out.print("Enter Marks for Accounts : ");
			int accounts = scanner.nextInt();
			commerceStudent.setAccountMarks(accounts);
			
			System.out.print("Enter Marks for Economics : ");
			int economics = scanner.nextInt();
			commerceStudent.setEconomicsMarks(economics);
			
			System.out.print("Enter Marks for Business : ");
			int business = scanner.nextInt();
			commerceStudent.setBusinessStudiesMarks(business);
			
			return commerceStudent.findPercentage();
		}
		else {
			return 0;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Which Student percentage do you want to find : ");
		int choice = sc.nextInt();
		
		getStudent(choice);
		
		sc.close();
	}

}
