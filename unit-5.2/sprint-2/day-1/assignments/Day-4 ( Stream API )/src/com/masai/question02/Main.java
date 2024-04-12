package com.masai.question02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Sonu", 450));
		list.add(new Student(12, "Hari", 540));
		list.add(new Student(13, "Jai", 510));
		list.add(new Student(14, "Emran", 200));
		list.add(new Student(15, "Arjun", 505));
		
		Optional<Student> opt = list.stream().max((s1,s2)-> s1.getMarks() > s2.getMarks()? 1: -1);
		
		Student student = opt.get();
		
		System.out.println(student);
		
	}

}
