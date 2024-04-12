package com.masai.dao;

public class UniversityUtil {
	
	public static UniversityDao getInstance(String dao) {
		
		UniversityDao universityDao = null;
		
		
		if(dao.equalsIgnoreCase("jdbc")) {
			
			universityDao = new UniversityDaoJdbcImpl();
		}
		else if(dao.equalsIgnoreCase("orm")) {
			
			universityDao = new UniversityDaoOrmImpl();
		}
		
		
		return universityDao;
	}

}
