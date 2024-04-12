package com.masai.question01;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return (e1.getSalary() > e2.getSalary())? 1: -1;
	
	}

}
