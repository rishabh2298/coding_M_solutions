package com.masai.question03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,12,13,14,15,16);
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		list.forEach(n -> map.put(n, n*n));

		
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		
		List<Map.Entry<Integer, Integer>> finalList = new ArrayList<>(set);
		
		
		
		list.forEach(s -> System.out.println(s));
		
		System.out.println("========================================");
		
		finalList.forEach(s -> System.out.println(s));

	}

}
