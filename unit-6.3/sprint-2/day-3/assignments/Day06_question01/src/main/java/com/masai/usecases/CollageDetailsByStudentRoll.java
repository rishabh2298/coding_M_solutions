package com.masai.usecases;

import java.util.Scanner;

import com.masai.model.Collage;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CollageDetailsByStudentRoll {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Roll");
		int roll = sc.nextInt();
		
		
		String jpql = "select s.collage from Student s where s.studentRoll = "+roll+"";
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		TypedQuery<Collage> query = em.createQuery(jpql,Collage.class);

		Collage studentCollage = query.getSingleResult();
		
		em.getTransaction().commit();
		
		em.close();
		
		
		sc.close();
		
		
		
		System.out.println("done");
		
		System.out.println(studentCollage);
	}

}
