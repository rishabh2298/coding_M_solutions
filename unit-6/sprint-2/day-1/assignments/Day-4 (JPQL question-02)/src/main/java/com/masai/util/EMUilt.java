package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUilt {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("Employee");
	}
	
	public static EntityManager provideConnection() {
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
