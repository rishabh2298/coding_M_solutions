package com.masai;

public class Main {
	// find prime no in array and give output of prime no's with return type of array;
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		
		int size = 0;
		int[] arr = new int[inputArray.length];
		
		for(int i=0; i<inputArray.length; i++) {
			int count = 0;
			for(int j=2; j<inputArray[i]; j++) {
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				size++;
				arr[i] = inputArray[i];
			}
		}
		
		int[] result = new int[size];
		int index = 0;
		for(int value:arr) {
			if(value>0) {
				result[index] = value;
				index++;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		int[] arr = {10,12,5,50,11,14,15};
		int[] result = main.findAndReturnPrimeNumbers(arr);

		if(result.length>0) {
			for(int num:result) {
				System.out.print(num+" ");
			}
		}
		else {
			System.out.println("Prime number not found in the supplied Array");
		}
	}

}
