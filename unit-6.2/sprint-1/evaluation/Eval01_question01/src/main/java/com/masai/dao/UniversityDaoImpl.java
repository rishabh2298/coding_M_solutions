package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entity.Student;
import com.masai.util.EMUtil;

public class UniversityDaoImpl implements UniversityDao {

	public Student findStudentById(int id) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		em.getTransaction().commit();
		
		em.close();
		
		return student;
	}

	public String saveStudent(Student student) {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		if(student==null) return "Student can't be null";
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student data save successfully";
	}

	public String deleteStudentById(int id) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		if(student==null) return "No such Student found";
		
		em.remove(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student data is deleted";
	}

	public String updateStudentCGPA(int id, int cgpa) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		if(student==null) return "No such Student found";
		
		student.setCgpa(cgpa);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student cgpa is changed to="+cgpa+" successfully";
	}

}
