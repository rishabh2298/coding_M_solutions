package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.CabOwner;
import com.masai.util.EMUtil;

public class GetAllCabOwner {
	
	public static void main(String[] args) {
	
		
		EntityManager em = EMUtil.providEntityManager();
		

		String jqpl = "select c from CabOwner c";
		
		Query query = em.createQuery(jqpl);
		
		List<CabOwner> owners = query.getResultList();
		
		
		owners.forEach(owner -> System.out.println(owner));
		
		
		em.close();
		
	}

}
