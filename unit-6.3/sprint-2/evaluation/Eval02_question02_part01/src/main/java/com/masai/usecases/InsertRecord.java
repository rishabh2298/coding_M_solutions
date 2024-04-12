package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;
import com.masai.util.EMUtil;

public class InsertRecord {
	
	public static void main(String[] args) {
		
		VegBiryani vegBiryani1 = new VegBiryani(7, 230, "descrip - veg 1");
		VegBiryani vegBiryani2 = new VegBiryani(6, 130, "descrip - veg 2");
		VegBiryani vegBiryani3 = new VegBiryani(8, 200, "descrip - veg 3");
		VegBiryani vegBiryani4 = new VegBiryani(9, 500, "descrip - veg 4");
		
		
		ChickenBiryani chickenBiryani1 = new ChickenBiryani(5, 320, "desp - 21");
		ChickenBiryani chickenBiryani2 = new ChickenBiryani(1, 220, "desp - 22");
		ChickenBiryani chickenBiryani3 = new ChickenBiryani(4, 300, "desp - 23");
		ChickenBiryani chickenBiryani4 = new ChickenBiryani(7, 100, "desp - 24");
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		// inserting veg biryani
		
		em.persist(vegBiryani1);
		em.persist(vegBiryani2);
		em.persist(vegBiryani3);
		em.persist(vegBiryani4);
		
		
		
		// inserting chicken biryani
		
		em.persist(chickenBiryani1);
		em.persist(chickenBiryani2);
		em.persist(chickenBiryani3);
		em.persist(chickenBiryani4);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}
