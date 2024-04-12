package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManager provideUserConnection() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
		
		EntityManager entityManager = emf.createEntityManager();
		
		return entityManager;
	}

	
	
	public static EntityManager providePhoneNumberConnection() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PhoneNumber");
		
		EntityManager entityManager = emf.createEntityManager();
		
		return entityManager;
	}
	
}
