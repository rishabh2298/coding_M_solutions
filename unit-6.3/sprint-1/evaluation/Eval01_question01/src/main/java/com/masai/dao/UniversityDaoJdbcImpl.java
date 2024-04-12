package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.util.DBUtil;

public class UniversityDaoJdbcImpl implements UniversityDao {

	
	@Override
	public Student findStudentById(int id) throws StudentException {
		
		Student student = new Student();
		
		try (Connection connection = DBUtil.provideConnection()) {
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id = "+id+"");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			String email = resultSet.getString("email");
			String address = resultSet.getString("address");
			int cgpa = resultSet.getInt("cgpa");
			
			student.setId(id);
			student.setEmail(email);
			student.setAddress(address);
			student.setCgpa(cgpa);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return student;
	}

	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudentCGPA(int id, int cgpa) {
		// TODO Auto-generated method stub
		return null;
	}

}
