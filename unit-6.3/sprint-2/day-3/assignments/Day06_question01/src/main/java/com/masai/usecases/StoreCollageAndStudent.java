package com.masai.usecases;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;

public class StoreCollageAndStudent {
	
	public static void main(String[] args) {
		
		
		Collage collage1 = new Collage();
		collage1.setCollageName("NIT Jamshedpur");
		collage1.setCollageAddress("Jamshedpur Tata");
		

		// students of collage-1
		
		Student student1 = new Student();
		student1.setStudentName("Rahul");
		student1.setMobileNumber("98985 54854");
		student1.setEmail("rahul@gmail.com");
		student1.setCollage(collage1);
		

		Student student2 = new Student();
		student2.setStudentName("Pankaj");
		student2.setMobileNumber("88885 54854");
		student2.setEmail("pankaj@gmail.com");
		student2.setCollage(collage1);
		

		Student student3 = new Student();
		student3.setStudentName("Anju");
		student3.setMobileNumber("90085 58452");
		student3.setEmail("anju@gmail.com");
		student3.setCollage(collage1);
		

		Student student4 = new Student();
		student4.setStudentName("Harish");
		student4.setMobileNumber("66985 54004");
		student4.setEmail("harish@gmail.com");
		student4.setCollage(collage1);
		
		
		// assosiating students with collage-1
		
		collage1.getStudents().add(student1);
		collage1.getStudents().add(student2);
		collage1.getStudents().add(student3);
		collage1.getStudents().add(student4);
		
		
		
		
		
		// students of collage-2
		

		Collage collage2 = new Collage();
		collage2.setCollageName("IIT Delhi");
		collage2.setCollageAddress("near Delhi metro");
		
		
		
		Student student5 = new Student();
		student5.setStudentName("Ajay");
		student5.setMobileNumber("95733 99549");
		student5.setEmail("ajay@gmail.com");
		student5.setCollage(collage2);
		

		Student student6 = new Student();
		student6.setStudentName("Ashish");
		student6.setMobileNumber("00045 22222)");
		student6.setEmail("ashish@gmail.com");
		student6.setCollage(collage2);
		

		Student student7 = new Student();
		student7.setStudentName("Prajwal");
		student7.setMobileNumber("43344 58452");
		student7.setEmail("prajwal@gmail.com");
		student7.setCollage(collage2);
		

		Student student8 = new Student();
		student8.setStudentName("Jai");
		student8.setMobileNumber("00985 54004");
		student8.setEmail("jai@gmail.com");
		student8.setCollage(collage2);
		
		
		
		// assosiationg students with collage-2
		
		collage2.getStudents().add(student5);
		collage2.getStudents().add(student6);
		collage2.getStudents().add(student7);
		collage2.getStudents().add(student8);
		
		
		
		
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		// by collage
		em.persist(collage1);
		
		// by student
		em.persist(student5);
		em.persist(student6);
		em.persist(student7);
		em.persist(student8);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println();
		System.out.println("check database");
		
		
				
		
//		mysql> show tables;
//		+-------------------+
//		| Tables_in_day06   |
//		+-------------------+
//		| collage           |
//		| collage_generator |
//		| student           |
//		| student_generator |
//		+-------------------+
//		4 rows in set (0.03 sec)
//		
//		
//		mysql> select * from collage;
//		+-----------+------------------+----------------+
//		| collageId | collageAddress   | collageName    |
//		+-----------+------------------+----------------+
//		|        50 | Jamshedpur Tata  | NIT Jamshedpur |
//		|        51 | near Delhi metro | IIT Delhi      |
//		+-----------+------------------+----------------+
//		2 rows in set (0.00 sec)
//		
//		
//		
//		mysql> select * from student;
//		+-------------+-------------------+--------------+-------------+--------+
//		| studentRoll | email             | mobileNumber | studentName | clg_id |
//		+-------------+-------------------+--------------+-------------+--------+
//		|          50 | rahul@gmail.com   | 98985 54854  | Rahul       |     50 |
//		|          51 | pankaj@gmail.com  | 88885 54854  | Pankaj      |     50 |
//		|          52 | anju@gmail.com    | 90085 58452  | Anju        |     50 |
//		|          53 | harish@gmail.com  | 66985 54004  | Harish      |     50 |
//		|          54 | ajay@gmail.com    | 95733 99549  | Ajay        |     51 |
//		|          55 | ashish@gmail.com  | 00045 22222) | Ashish      |     51 |
//		|          56 | prajwal@gmail.com | 43344 58452  | Prajwal     |     51 |
//		|          57 | jai@gmail.com     | 00985 54004  | Jai         |     51 |
//		+-------------+-------------------+--------------+-------------+--------+
//		8 rows in set (0.00 sec)
		
		
	}

}
