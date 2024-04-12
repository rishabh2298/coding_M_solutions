package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManager provideConnection(String entityName) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(entityName);
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
