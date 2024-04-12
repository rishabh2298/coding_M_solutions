package com.masai.question03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "N1", "A1", 450));
		list.add(new Student(12, "N2", "A2", 250));
		list.add(new Student(13, "N3", "A3", 250));
		list.add(new Student(11, "N1", "A1", 450));
		list.add(new Student(15, "N5", "A5", 320));
		
//		System.out.println(list);

		Set<Student> set = new LinkedHashSet<>(list);

		
		Set<Student> tSet = new TreeSet<>(new SortByMarks());
		tSet.addAll(set);
		
		
		List<Student> sortList = new ArrayList<>(tSet);
		
		for(Student s:sortList) {
		
			Student stu = s;
			
			System.out.println("Roll No = "+stu.getRoll());
			System.out.println("Name = "+stu.getName());
			System.out.println("Address = "+stu.getAddress());
			System.out.println("Marks = "+stu.getMarks());
			
			System.out.println();
		}
	}
	
}
