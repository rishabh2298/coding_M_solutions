package com.masai.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.util.DataBase;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private DataBase dataBase;
	
	public String addStudent(Student student) {
		
		if(student==null) return "Student can't be null";
		
		try(Connection connection = dataBase.provideConnection()) {
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Student values(?,?,?,?);");
			
			preparedStatement.setInt(1, student.getRollNo());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3, student.getAddress());
			preparedStatement.setInt(4, student.getMarks());
			
			
			int status = preparedStatement.executeUpdate();
			
			if(status>0) return "Student added successfully....";
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return "Fails to add student";
	}
	
	
	

	public Student getStudent(int stuId) {

		
		Student student = null;
		
		
		try(Connection connection = dataBase.provideConnection()) {
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from Student where rollNo = ?");
			preparedStatement.setInt(1, stuId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			int rollNo = resultSet.getInt("rollNo");
			String name = resultSet.getString("name");
			String address = resultSet.getString("address");
			int marks = resultSet.getInt("marks");

			student = new Student(rollNo, name, address, marks);
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
		return student;
	}

}







