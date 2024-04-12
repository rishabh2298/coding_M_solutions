package com.masai.question04;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, List<String>> hm = new HashMap<>();
		
		List<String> one = Arrays.asList("Raipur","Durg","Bhilai","Bilaspur");
		hm.put("Chhattisgarh",one);
		
		List<String> two = Arrays.asList("Lucknow","Agra","Kanpur","Prayagraj");
		hm.put("Uttar Pradesh", two);
		
		List<String> three = Arrays.asList("Kochi","Kollam","Kannur","Valaya");
		hm.put("Kerla", three);
		
		List<String> four = Arrays.asList("Patna","Gaya","Darbhanga","siwan");
		hm.put("Bihar", four);
		
		
		
		Set<Map.Entry<String,List<String>>> set = hm.entrySet();
		
		Set<Map.Entry<String, List<String>>> sortedSet = new TreeSet<>(new SortStateName());
		sortedSet.addAll(set);
		
		for(Map.Entry<String, List<String>> ans : sortedSet) {
			System.out.println(ans.getKey()+" => "+ans.getValue());
		}
	}

}
