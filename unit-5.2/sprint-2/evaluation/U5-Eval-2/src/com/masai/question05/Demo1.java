package com.masai.question05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Raj", 120, "raj@gmail.com", "raj", new Address("Chhattisgarh", "Bhilai", "111111")));
		list.add(new Student(11, "Hari", 150, "hari@gmail.com", "hari", new Address("U.P.", "Lacknow", "222222")));
		list.add(new Student(11, "Gajendra", 40, "gaj@gmail.com", "gajju", new Address("Bihar", "Patna", "333333")));
		list.add(new Student(11, "Om", 180, "om@gmail.com", "omi", new Address("Jharkhand", "Ranchi", "444444")));
		list.add(new Student(11, "Ved", 220, "ved@gmail.com", "vedant", new Address("T.N.", "Hydrabad", "555555")));
	
		
		
		oos.writeObject(list);
		
		System.out.println("Serialization from demo1 'completed'");
		
		oos.close();
	}

}
