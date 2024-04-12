package com.masai.question04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static Map<String, Student> sortedMap(HashMap<String,Student> map){
		
		Set<Map.Entry<String,Student>> set = map.entrySet();
		
		Set<Map.Entry<String,Student>> sortedSet = new TreeSet<>(new SortByValue());
		sortedSet.addAll(set);
		
		Map<String, Student> sortMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s: sortedSet) {
			sortMap.put(s.getKey(), s.getValue());
		}
		
		return sortMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Haryana", new Student(10, "N1", 200));
		hm.put("Kerla", new Student(12, "N2", 150));
		hm.put("C.G.", new Student(14, "N3", 320));
		hm.put("Chennai", new Student(15, "N4", 500));
		hm.put("M.P", new Student(16, "N5", 50));

		Map<String, Student> ansMap = sortedMap(hm);
		
		for(Map.Entry<String, Student> ans: ansMap.entrySet()) {
			System.out.println("Student is from = "+ans.getKey());
			System.out.println("===========================");
			Student stu = ans.getValue();
			System.out.println("Studen Roll = "+stu.getRoll());
			System.out.println("Studen Name = "+stu.getName());
			System.out.println("Studen Marks = "+stu.getMarks());
			System.out.println();
		}
	}

}
