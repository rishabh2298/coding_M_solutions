package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("data.properties")
public class AppConfig {
	
//	@Bean
//	public List<String> getCities(){
//		
//		List<String> list = new ArrayList<>();
//		
//		list.add("Delhi");
//		list.add("Mumbai");
//		list.add("Banglore");
//		list.add("Chennai");
//		list.add("Hydrabad");
//		
//		return list;
//	}
	
	@Bean("stud")
	public List<Student> getStudents(){
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Raju", 130));
		list.add(new Student(12, "Harish", 122));
		list.add(new Student(13, "Pankaj", 145));
		list.add(new Student(14, "Babu", 157));
		list.add(new Student(15, "Heera", 140));
		
		return list;
	}

}
