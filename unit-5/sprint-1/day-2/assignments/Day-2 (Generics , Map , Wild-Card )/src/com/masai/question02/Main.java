package com.masai.question02;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<Student, String> treeMap = new TreeMap<>();
		
		treeMap.put(new Student(11, "Tania", 220), "Uttar Pradesh");
		treeMap.put(new Student(12, "Harish", 50), "Bihar");
		treeMap.put(new Student(15, "Banty", 110), "West Bengal");
		treeMap.put(new Student(13, "Birju", 2), "Jammmu");

		Set<Map.Entry<Student,String>> set= treeMap.entrySet();
		
		for(Map.Entry<Student,String> k:set) {
			System.out.println(k.getKey()+" => "+k.getValue());
		}
	}

}
