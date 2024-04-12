package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.VegBiryani;
import com.masai.util.EMUtil;

public class GetAllVegBiryani {
	
	public static void main(String[] args) {
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "from VegBiryani";
		
		List<VegBiryani> vegBiryanis = em.createQuery(jpql).getResultList();
	
		
		vegBiryanis.forEach(biryani -> System.out.println(biryani));
		
	}
  
}
