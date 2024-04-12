package com.masai.question04;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortStateName implements Comparator<Map.Entry<String, List<String>>> {

	@Override
	public int compare(Entry<String, List<String>> o1, Entry<String, List<String>> o2) {
		
		return o2.getKey().compareToIgnoreCase(o1.getKey());
	}
}
