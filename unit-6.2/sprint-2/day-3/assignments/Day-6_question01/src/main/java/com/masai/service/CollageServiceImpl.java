package com.masai.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.util.EMUtil;

public class CollageServiceImpl implements CollageService {

	@Override
	public String addCollage(Collage collage) {
		
		if(collage==null) return "Please fill valid details.....";
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(collage);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Collage added Successfully....";
	}

	@Override
	public List<Student> getStudentsOfCollage(Integer collageId) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("getStudentsByCollageId");
		query.setParameter("id", collageId);
		
		Collage collage = (Collage)query.getSingleResult();
		
		List<Student> students = collage.getStudents();
		
		em.getTransaction().commit();
		
		em.close();
		
		return students;
	}

}
