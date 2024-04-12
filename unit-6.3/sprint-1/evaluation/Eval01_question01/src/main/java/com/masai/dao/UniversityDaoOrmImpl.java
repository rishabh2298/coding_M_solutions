package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.util.EMUtil;

public class UniversityDaoOrmImpl implements UniversityDao {

	
	@Override
	public Student findStudentById(int id) throws StudentException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		if(student==null) throw new StudentException("Student with this id doesn't exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return student;
		
	}

	
	
	@Override
	public String saveStudent(Student student) {
		

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student save successfully";
		
	}

	
	
	@Override
	public String deleteStudentById(int id) {


		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		if(student==null) return "Student with this id doesn't exist";
		
		em.remove(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student data deleted successfully";
		
	}
	

	@Override
	public String updateStudentCGPA(int id, int cgpa) {


		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, id);
		
		if(student==null) return "No such student found with this id";
		
		student.setCgpa(cgpa);
		
		em.merge(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Student CGPA updated successfully";
		
	}

}
