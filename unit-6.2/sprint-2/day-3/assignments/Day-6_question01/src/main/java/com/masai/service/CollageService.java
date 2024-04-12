package com.masai.service;

import java.util.List;

import com.masai.model.Collage;
import com.masai.model.Student;

public interface CollageService {
	
	public String addCollage(Collage collage);
	
	public List<Student> getStudentsOfCollage(Integer collageId);

}
