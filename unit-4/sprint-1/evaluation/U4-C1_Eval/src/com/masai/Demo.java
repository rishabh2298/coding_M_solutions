package com.masai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 64;
		int b = 70;
		
		byte c = (byte)(a+b);
		System.out.println(c);
		
//		Explanation of this
		
		/*
		 * Here a we have to do explicit type-casting because both a and b are integer
		 * type data type and for down-casting we have to apply byte datatype before
		 * evaluating it in line(13).
		 * 
		 * All mathematical calculations in java is work's on concept of max(int, typeA,
		 * typeB, typeC, ....) here types are the datatype of that particular variable
		 * to which data is assign via assignment operator (line 10 & 11). And result will
		 * be the max datatype among them.
		 * 
		 * So here all type are integer datatype so result is also comes in integer
		 * datatype. Therefore we have to type case final result in byte datatype in
		 * (line 13).
		 */
		
	}

}
