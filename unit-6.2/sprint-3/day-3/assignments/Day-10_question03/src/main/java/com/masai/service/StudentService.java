package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.model.Student;

@Service
public interface StudentService {
	
	public String addStudent(Student student);
	
	public Student getStudent(int stuId);

}
