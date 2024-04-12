package com.masai.question02;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeId() > o2.getEmployeeId()? 1: -1;
	
	}

}
