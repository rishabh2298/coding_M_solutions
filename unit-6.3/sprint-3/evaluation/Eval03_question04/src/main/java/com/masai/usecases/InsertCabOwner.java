package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Cab;
import com.masai.model.CabOwner;
import com.masai.util.EMUtil;

public class InsertCabOwner {

	public static void main(String[] args) {

		
		CabOwner owner1 = new CabOwner();
		
		owner1.setOwnerName("Raju");
		owner1.setPhoneNumber("11111 22222");
		owner1.setEmailId("raju@gmail.com");
		owner1.setCab(new Cab(11, "Red", "Tata Indica"));
		
		

		CabOwner owner2 = new CabOwner();
		
		owner2.setOwnerName("Pinky");
		owner2.setPhoneNumber("56114 98922");
		owner2.setEmailId("pinky@gmail.com");
		owner2.setCab(new Cab(12, "Blue", "Tata Nano"));
		

		CabOwner owner3 = new CabOwner();
		
		owner3.setOwnerName("Rajesh");
		owner3.setPhoneNumber("79087 2972");
		owner3.setEmailId("rajesh@gmail.com");
		owner3.setCab(new Cab(13, "White", "Hyundai creata"));
		
		

		CabOwner owner4 = new CabOwner();
		
		owner4.setOwnerName("Hajju");
		owner4.setPhoneNumber("98734 89442");
		owner4.setEmailId("hajju@gmail.com");
		owner4.setCab(new Cab(14, "black", "Tata altroz"));
		
		
		
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(owner1);
		em.persist(owner2);
		em.persist(owner3);
		em.persist(owner4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
	}
	
}
