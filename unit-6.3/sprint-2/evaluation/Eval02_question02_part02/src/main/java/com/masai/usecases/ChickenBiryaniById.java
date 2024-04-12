package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.ChickenBiryani;
import com.masai.util.EMUtil;

public class ChickenBiryaniById {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id to get Chicken Biryabi");
		int id = sc.nextInt();
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Query query = em.createNamedQuery("ChickenBiryani.byId");
		query.setParameter("id", id);
		
		List<ChickenBiryani> biryanis = query.getResultList();
		
		
		if(biryanis.isEmpty()) System.out.println("No Chicken Biryani found");
		else {
			
			biryanis.forEach(food -> System.out.println(food));
			
		}
		
		em.close();
		
		sc.close();
		
	}

}
