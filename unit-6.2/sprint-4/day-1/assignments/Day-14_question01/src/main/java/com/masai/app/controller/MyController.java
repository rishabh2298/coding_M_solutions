package com.masai.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masai.app.model.Address;
import com.masai.app.model.Student;

@Controller
@ResponseBody
public class MyController {
	
	// PART - 1

	@RequestMapping("/student")
	public Student getStudent() {
		
		Student student = new Student();
		
		student.setEmpId(11);
		student.setName("Rishabh Mishra");
		student.setSalary(50000);
		student.setAddress(new Address(5, "Pune", "343 556", "Maharastra"));
		
		return student;
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getListOfStudents() {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Harish Rajput", 24000, new Address(21, "Pune", "232 443", "M.H.")));
		list.add(new Student(12, "Rajesh Prasad", 33000, new Address(22, "Banglore", "221 333", "Karantka")));
		list.add(new Student(12, "Kishore Verma", 21000, new Address(23, "Hydrabad", "332 244", "Telangana")));
		list.add(new Student(12, "Hardeep Singh", 12000, new Address(24, "Indore", "666 453", "M.P.")));
		list.add(new Student(12, "Akashay DeepSingh", 3000, new Address(25, "Patna", "999 443", "Bihar")));
		
		return list;
	}
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to Spring Boot";
	} 
	
	
	
	
	// PART - 2

	@RequestMapping(value="/student/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public String updateStudent( @PathVariable("id") Integer id, @RequestBody Student student) {
		
		student.setEmpId(id);
		
		return "Updated Student Details = "+student;
	
	}
	
	
	// PART - 3
	
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		
		return "Student Details => "+student.toString();
	}
	
	
	@RequestMapping(value = "/address", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addAddress(@RequestBody Address address) {
		
		return "Address Details => "+address;
	}
	
	
	
	
	
	
	
	
	
}

