package com.masai.question02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {

	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		if(mobiles.containsKey(company)) {
			ArrayList<String> list = mobiles.get(company);
			list.add(model);
			mobiles.put(company, list);
		}
		else {
			ArrayList<String> list = new ArrayList<>();
			list.add(model);
			mobiles.put(company, list);
		}
		return ("Mobile added successfully");
		
	}
	
	public List<String> getModels(String company){
		if(mobiles.containsKey(company)) {
			List<String> list = mobiles.get(company);
			return list;
		}
		else {
			List<String> list = null;
			return list;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mobile = new Mobile();
		
		mobile.addMobile("Apple", "Iphone 13");
		mobile.addMobile("Apple", "Iphone 11");
		mobile.addMobile("Apple", "Iphone 12");
		mobile.addMobile("Samsung", "Galaxy M13");
		mobile.addMobile("Samsung", "Galaxy M20");
		
		List<String> result = mobile.getModels("Apple");
		
		if(result!=null) {
			System.out.println(result);
		}
		else {
			System.out.println(" Invalid Company Supplied ");
		}
		
	}

}
