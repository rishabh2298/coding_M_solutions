package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManager providEntityManager() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		
		return emf.createEntityManager();
		
	}

}
