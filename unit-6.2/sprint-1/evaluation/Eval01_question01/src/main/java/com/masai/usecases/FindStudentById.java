package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UniversityDao;
import com.masai.dao.UniversityDaoImpl;

public class FindStudentById {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Id to get details");
		int stuId = scanner.nextInt();
		
		UniversityDao dao = new UniversityDaoImpl();
		
		System.out.println(dao.findStudentById(stuId));
		
		scanner.close();

	}

}
