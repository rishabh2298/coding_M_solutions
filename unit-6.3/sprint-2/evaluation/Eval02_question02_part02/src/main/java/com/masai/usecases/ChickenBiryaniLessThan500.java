package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.ChickenBiryani;
import com.masai.util.EMUtil;

public class ChickenBiryaniLessThan500 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		

		Query query = em.createNamedQuery("ChickenBiryani.lessThan500");
		
		List<ChickenBiryani> biryanis = query.getResultList();
		
		
		if(biryanis.isEmpty()) System.out.println("No Chicken Biryani less than 500 found");
		else {
			
			biryanis.forEach(food -> System.out.println(food));
			
		}
		
		em.close();
		
	}

}
