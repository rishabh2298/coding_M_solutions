package com.masai.question05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> students = (List<Student>)ois.readObject();
	
		System.out.println("Deserialization start's");
		System.out.println();
	
		for(Student s:students) {
			System.out.println(s);
		}
		
		ois.close();
		
		System.out.println();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
		oos.writeObject(new Student(20, "New Student", 400, "new@gmail.com","newPassword",new Address("T.N.", "Chennai", "999999")));
		
		System.out.println("new Student data added");
	
		oos.close();
	}

}
