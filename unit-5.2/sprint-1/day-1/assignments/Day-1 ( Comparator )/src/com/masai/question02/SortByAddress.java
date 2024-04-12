package com.masai.question02;

import java.util.Comparator;

public class SortByAddress implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAddress().compareToIgnoreCase(o2.getAddress());
		
	}

}
