package com.masai.dao;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface UniversityDao {
	
	public Student findStudentById(int id) throws StudentException;
	
	public String saveStudent(Student student);
	
	public String deleteStudentById(int id);
	
	public String updateStudentCGPA(int id, int cgpa);

}
