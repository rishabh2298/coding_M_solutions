package com.masai.question03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap){

		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		
		// Sorting technique
		Comparator<Map.Entry<String, Student>> comp = (s1,s2) -> s2.getValue().getName().compareToIgnoreCase(s1.getValue().getName());
		
		
		Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(comp);
		sortedSet.addAll(set);
		

		Map<String, Student> map = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> m:sortedSet) {
			map.put(m.getKey(), m.getValue());
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		
		map.put("Delhi", new Student(11, "Harish", "hari@gmail.com", 560));
		map.put("Banglore", new Student(12, "Dev", "dev@gmail.com", 660));
		map.put("Hydrabad", new Student(13, "Atif", "atif@gmail.com", 360));
		map.put("Aligarh", new Student(14, "Mahmood", "mahmood@gmail.com", 400));
		map.put("Patna", new Student(15, "Anil", "anil@gmail.com", 760));
		
		Map<String, Student> ansMap = new Main().sortMapUsingStudentName(map);
		
//		for(Map.Entry<String, Student> ans : ansMap.entrySet()) {
//			
//			System.out.println(ans.getKey()+" = "+ans.getValue());
//		
//		}
		
		PrintValue myPrint = m -> System.out.println(m.getKey()+" = "+m.getValue());
		
		for(Map.Entry<String, Student> ans : ansMap.entrySet()) {
			
			myPrint.printMyString(ans);
			
		}
		
		
	}

}
