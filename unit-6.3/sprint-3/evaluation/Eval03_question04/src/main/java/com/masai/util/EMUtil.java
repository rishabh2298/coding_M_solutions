package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("Eval03-Unit");
	}
	
	public static EntityManager providEntityManager() {
		return emf.createEntityManager();
	}

}
