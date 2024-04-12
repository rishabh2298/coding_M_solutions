package com.masai.question03;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(21, "vegita", 50, 60, 70));
		students.add(new Student(22, "majin-boo", 50, 60, 70));
		students.add(new Student(23, "Goku", 57, 67, 77));
		students.add(new Student(24, "Beerus", 40, 50, 90));
		students.add(new Student(25, "Whis", 56 ,76, 45));
		students.add(new Student(26, "Gohan", 33, 54, 55));

		for(Student st:students) {
			System.out.println(st);
		}
	}

}
