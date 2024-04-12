package com.masai.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.util.EMUtil;

public class StudentServiceImpl implements StudentService {

	@Override
	public Collage getCollageDetails(Integer studentRoll) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("GetCollageByStudentId"); 
		query.setParameter(1, studentRoll);
		
		Student student = (Student)query.getSingleResult();
		
		Collage collage = student.getCollage();
		
		em.getTransaction().commit();
		
		em.close();
		
		return collage;
	}

}
