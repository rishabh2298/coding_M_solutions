package dao;

import java.util.List;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utilities.EMUtil;

public class StudentDaoImpl implements StudentDao {

	
	
	@Override
	public Student registerStudent(Student student) throws StudentException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		if(student==null) throw new StudentException("Please don't pass null value...");
		
		Student addedStudent = em.merge(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		return addedStudent;
	}

	
	
	@Override
	public Student getStudentFromStudentId(int studentId) throws StudentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, studentId);
		
		if(student==null) throw new StudentException("Student with this id doesn't exist...");
		
		em.getTransaction().commit();
		
		em.close();
		
		return student;
	}

	
	
	@Override
	public List<Student> getAllActiveStudents() throws StudentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("Student.activeStudents",Student.class);
		
		List<Student> students = (List<Student>)query.getResultList();
		
		if(students.isEmpty()) throw new StudentException("No student is active...");
		
		em.getTransaction().commit();
		
		em.close();
		
		return students;
	}

	
	
	@Override
	public College getCollegeFromStudentId(int studentId) throws CollegeException, StudentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, studentId);
		
		if(student==null) throw new StudentException("No such student found with this studentId...");

		
		Query query = em.createNamedQuery("Student.college");
		
		List<College> colleges = (List<College>)query.getResultList();
		
		if(colleges.isEmpty()) throw new CollegeException("Student is not registerd with college...");
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
		return colleges.get(0);
		
	}
	

}
