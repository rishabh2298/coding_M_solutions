package com.masai.dao;

import com.masai.entity.Student;

public interface UniversityDao {
	
	public Student findStudentById(int id);
	
	public String saveStudent(Student student);
	
	public String deleteStudentById(int id);
	
	public String updateStudentCGPA(int id, int cgpa);

}
