package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	public static EntityManager providEntityManager(String entity) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(entity);
		
		return emf.createEntityManager();
	}

}
