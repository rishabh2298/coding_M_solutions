package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.ChickenBiryani;
import com.masai.util.EMUtil;

public class AllChickenBiryani {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "from ChickenBiryani";
		
	 	List<ChickenBiryani> biryanis = em.createQuery(jpql).getResultList();
		
	 	
	 	if(biryanis.isEmpty()) System.out.println("No chicken biryani in list");
	 	else {
			
	 		biryanis.forEach(food -> System.out.println(food));
	 		
		}
	 	
	 	em.close();
	}

}
