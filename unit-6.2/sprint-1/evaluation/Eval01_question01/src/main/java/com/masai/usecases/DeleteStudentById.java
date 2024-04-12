package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UniversityDao;
import com.masai.dao.UniversityDaoImpl;

public class DeleteStudentById {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Id to delete data");
		int id = scanner.nextInt();
		
		
		
		UniversityDao dao = new UniversityDaoImpl();
		
		System.out.println(dao.deleteStudentById(id));
		
		scanner.close();

	}

}
