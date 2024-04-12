package com.masai.question03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Chhattisgarh", "Raipur");
		lhm.put("Utter Pradesh", "Lucknow");
		lhm.put("Bihar", "Patna");
		lhm.put("Telangana", "Hydrabad");
		lhm.put("Punjab", "Chandigarh");

		Set<Map.Entry<String, String>> set = lhm.entrySet();

		System.out.println(lhm);
		for(Map.Entry<String, String> result:set) {
			System.out.println(result.getKey()+" => "+result.getValue());
		}
	}

}
