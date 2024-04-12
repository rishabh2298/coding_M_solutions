package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("Product");
	}
	
	public static EntityManager provideConnection() {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}

}
