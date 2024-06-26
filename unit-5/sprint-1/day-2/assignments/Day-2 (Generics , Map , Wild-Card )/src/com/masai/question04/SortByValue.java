package com.masai.question04;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue implements Comparator<Map.Entry<String, Student>>{

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		return o1.getValue().getMarks() > o2.getValue().getMarks()? 1: -1;
	}

}
