package com.masai.question05.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {

	public static EntityManager getConnection() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		
		EntityManager em = emf.createEntityManager();
	
		return em;
	}
	
}
