package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UniversityDao;
import com.masai.dao.UniversityDaoImpl;
import com.masai.entity.Student;

public class AddStudent {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Email");
		String email = scanner.next();
		
		scanner.nextLine();
		System.out.println("Enter Student address");
		String address = scanner.nextLine();
		
		System.out.println("Enter Student cgpa");
		int cgpa = scanner.nextInt();
		
		
		
		Student student = new Student(email, address, cgpa);
		
		UniversityDao dao = new UniversityDaoImpl();
		
		System.out.println(dao.saveStudent(student));
		
		scanner.close();

	}

}
