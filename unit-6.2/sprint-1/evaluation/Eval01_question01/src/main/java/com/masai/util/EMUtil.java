package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	public static EntityManager provideEntityManager() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("university");
		
		return emf.createEntityManager();
	}
	
}
