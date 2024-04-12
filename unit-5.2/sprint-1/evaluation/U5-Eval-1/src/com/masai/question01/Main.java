package com.masai.question01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "N1", 450));
		list.add(new Student(12, "N2", 550));
		list.add(new Student(13, "N3", 350));
		list.add(new Student(14, "N4", 600));
//		list.add(new Student(15, "N5", 560));)
		
		// Predicate
		System.out.println("Example of Predicate");
		System.out.println();
		
		Predicate<Student> predicate = s -> s.getStudentMarks() > 500;
		
		for(Student s: list) {
			System.out.println(s+" => "+predicate.test(s));
		}
		System.out.println("===========================");
		System.out.println();
		
		
		// Consumer
		System.out.println("Example of Consumer");
		System.out.println();
		
		Consumer<Student> consumer = s -> System.out.println("Welcome "+ s.getStudentName());
		
		for(Student s:list) {
			consumer.accept(s);
		}
		
		System.out.println("=================================");
		System.out.println();
		
		
		// Supplier
		System.out.println("Example of Supplier");
		System.out.println();
		
		Supplier<Student> supplier = () -> new Student(20, "N20", 900);
		
		System.out.println(supplier.get());
		
		System.out.println("=================================");
		System.out.println();
		
		
		// Function
		System.out.println("Example of Function");
		System.out.println();
		
		Function<Student, String> fun = s -> (s.getStudentMarks() > 500 ? "Pass":"Fail");
		
		for(Student s: list) {
			System.out.println(s+" => "+fun.apply(s));
		}
	}
	
}














