package com.masai.question03;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Delhi","Banglore","Mumbai","Pune","Durg","Raipur");
		
		PrintList ans = city -> System.out.println(city);
		
		ans.display(list);
		
	}
	
}
