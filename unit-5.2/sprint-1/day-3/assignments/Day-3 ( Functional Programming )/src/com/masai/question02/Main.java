package com.masai.question02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Rajest", 380));
		list.add(new Student(12, "Amrita", 660));
		list.add(new Student(13, "Gajodhar", 550));
		list.add(new Student(14, "Ketan", 600));
		list.add(new Student(15, "Hari", 660));
		list.add(new Student(16, "Kishore", 700));
		
		// Predicate
		Predicate<Student> predicate = s -> s.getMarks() > 650;
		
		System.out.println("Solution of Predicate");
		System.out.println();
		
		for(Student s:list) {
			System.out.println(s+" => "+predicate.test(s));
		}
		
		System.out.println("==========================================");
		
		
		// Supplier
		Supplier<Student> supplier = () -> new Student(20, "New Student", 800);
		
		System.out.println("Solution for Supplier");
		System.out.println();

		Student ansStudent = supplier.get();
		System.out.println(ansStudent);

		System.out.println("=============================================");
		
		
		// Consumer
		Consumer<Student> consumer = s -> {
			System.out.println("Student RollNo = "+s.getRollNo());
			System.out.println("Student Name = "+s.getName());
			System.out.println("Student Marks = "+s.getMarks());
			System.out.println();
		};
		
		System.out.println("Solution of Consumer");
		System.out.println();
		list.forEach(consumer);
		
		System.out.println("==============================================");
		
		
		// Function
		Function<Student, String> function = s -> s.getMarks() > 550 ? "Pass" : "Fail";
		
		System.out.println("Solution of Function");
		System.out.println();
		
		for(Student s:list) {
			String ans = function.apply(s);
			System.out.println(s+" = "+ans);
		}
		
	}

}









