package com.masai.question03;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByName implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		return o2.getValue().getName().compareToIgnoreCase(o1.getValue().getName());
	}

}
