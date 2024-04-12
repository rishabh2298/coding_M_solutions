package com.masai.question02;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getSalary() > o2.getSalary()) return +1;
		
		else if(o1.getSalary() < o2.getSalary()) return -1;
		
		else {
			return o1.getAddress().compareToIgnoreCase(o2.getAddress());
		}
	}

}
