package com.masai.question01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		TreeMap<Employee, String> tm = new TreeMap<>(new SortBySalary());
		
		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();

		for(Map.Entry<Employee, String> me: set) {
			tm.put(me.getKey(), me.getValue());
		}
		
		return tm;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, String> hm = new HashMap<>();
		
		hm.put(new Employee(10, "Rajesh", 25000), "banglore");
		hm.put(new Employee(10, "Suresh", 20700), "chennai");
		hm.put(new Employee(10, "Ramu", 16666), "gurugram");
		hm.put(new Employee(10, "Sonty", 22100), "hydrabad");
		hm.put(new Employee(10, "Hari", 10000), "mumbai");
		
		Demo d1 = new Demo();
		
		Map<Employee, String> resultMap = d1.sortMapUsingEmployeeSalary(hm);
		
		Set <Map.Entry<Employee, String>> result = resultMap.entrySet();
		
		for(Map.Entry<Employee, String> r:result) {
			System.out.println(r.getKey()+"from"+r.getValue());
		}
	}

}
