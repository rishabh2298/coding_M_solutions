package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.model.Student;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class GetAllStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Collage Id");
		int id = sc.nextInt();
		
		
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();

		
		String jpql = "select c.students from Collage c where c.collageId = "+id+"";
		
		Query query = em.createQuery(jpql);
		
		List<Student> students = (List<Student>)query.getResultList();
		
		em.getTransaction().commit();
		
		em.close();
		
		sc.close();
		
		
		
		
		students.forEach(stu -> System.out.println(stu));
		
		
		
	}
	
}
