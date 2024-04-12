package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("day-3 Unit");
	}
	
	public static EntityManager provoidEntityManager() {
		return emf.createEntityManager();
	}

}
