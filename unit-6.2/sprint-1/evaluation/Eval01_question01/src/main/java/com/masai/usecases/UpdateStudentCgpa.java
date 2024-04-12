package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UniversityDao;
import com.masai.dao.UniversityDaoImpl;

public class UpdateStudentCgpa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student ID to update CGPA");
		int id = scanner.nextInt();
		
		System.out.println("Enter new CGPA");
		int cgpa = scanner.nextInt();
		
		
		
		UniversityDao dao = new UniversityDaoImpl();
		
		System.out.println(dao.updateStudentCGPA(id, cgpa));
		
		scanner.close();

	}

}
