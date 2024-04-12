package com.masai.question03;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Members> ts = new TreeSet<>();
		
		ts.add(new Members(11, "Raju", 101, "12"));
		ts.add(new Members(12, "Pulkit", 102, "10"));
		ts.add(new Members(13, "Ajay", 103, "20"));
		ts.add(new Members(14, "Bhoomi", 104, "15"));
		ts.add(new Members(15, "Pushpa", 105, "04"));
		
		System.out.println(ts);
		
	}

}
