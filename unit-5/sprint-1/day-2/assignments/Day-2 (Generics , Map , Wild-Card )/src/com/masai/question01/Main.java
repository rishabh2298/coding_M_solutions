package com.masai.question01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List<?> func1(List<? super Main> list){
		
		return list;
	}

	public static void main(String[] args) {

		List<Object> oList = Arrays.asList(10,"Name",new Main(),true);
		List<Main> mList = Arrays.asList(new Main(),new Main());
		List<Integer> iList = Arrays.asList(10,20,30,40);
		
//		List<Object> result1 = func1(oList);
//		List<Object> result2 = func1(mList);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your choice : ");
		String result = input.next(); 
		
		List<Object> list = new ArrayList<>();
		list.add(result);
		
		while(!result.equalsIgnoreCase("n")) {
			System.out.print("Enter data for list : ");
			result = input.next();
			list.add(result);
		}
	}

}
