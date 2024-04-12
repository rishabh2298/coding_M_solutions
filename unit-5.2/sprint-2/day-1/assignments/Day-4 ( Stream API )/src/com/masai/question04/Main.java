package com.masai.question04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Student> set = new LinkedHashSet<>();
		
		set.add(new Student(11, "Hari", 540));
		set.add(new Student(12, "Sonu", 450));
		set.add(new Student(13, "Jai", 510));
		set.add(new Student(14, "Emran", 200));
		set.add(new Student(15, "Arjun", 505));
		
		
		Set<Student> finalSet = set.stream()
									.filter(s -> s.getMarks() < 500)
									.collect(Collectors.toSet());
		
		finalSet.forEach(s -> System.out.println(s));
		
	}

}
