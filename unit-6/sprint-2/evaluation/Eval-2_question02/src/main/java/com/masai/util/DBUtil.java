package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManager provideConnection(String unitName) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unitName");
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
