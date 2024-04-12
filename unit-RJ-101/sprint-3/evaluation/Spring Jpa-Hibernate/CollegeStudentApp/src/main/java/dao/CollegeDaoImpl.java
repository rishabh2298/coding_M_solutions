package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utilities.EMUtil;

public class CollegeDaoImpl implements CollegeDao {

	
	@Override
	public College registerCollege(College college) throws CollegeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();

		if(college==null) throw new CollegeException("Don't pass null value...");
		
		College savedCollege = em.merge(college);
		
		em.getTransaction().commit();
		
		em.close();

		return savedCollege;
	}

	
	
	@Override
	public College getCollegeFromCollegeId(int collegeId) throws CollegeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		College existedCollege = em.find(College.class, collegeId);
		
		if(existedCollege==null) throw new CollegeException("College with this id does not exist...");
		
		em.getTransaction().commit();
		
		em.close();

		return existedCollege;
	}

	
	
	@Override
	public List<College> getAllCollege() throws CollegeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("College.listOfColleges",College.class);
		
		List<College> colleges = (List<College>)query.getResultList();
		
		if(colleges.isEmpty()) throw new CollegeException("No college registerd yet...");
		
		em.getTransaction().commit();
		
		em.close();

		return colleges;
	}

	
	
	@Override
	public Student registerStudentToCollege(int studentId, int collegeId) throws CollegeException, StudentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, studentId);
		College college = em.find(College.class, collegeId);
		
		if(student==null) throw new StudentException("Student with this id not exist...");
		if(college==null) throw new CollegeException("College with this id not exist...");
		
		college.getStudents().add(student);
		student.setCollege(college);
		
		em.getTransaction().commit();
		
		em.close();

		return student;
	}

	
	
	@Override
	public List<Student> getAllStudentsFromCollegeId(int collegeId) throws CollegeException, StudentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		College college = em.find(College.class, collegeId);
		
		if(college==null) throw new CollegeException("College with this id does not exist...");
		
		
		Set<Student> set = college.getStudents();
		
		if(set.isEmpty()) throw new CollegeException("This college has no student");
		
		
		List<Student> students = new ArrayList<>(set);
		
		em.getTransaction().commit();
		
		em.close();

		return students;
	}

	
}
