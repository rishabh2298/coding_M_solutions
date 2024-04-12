package com.masai.usecase;

import java.util.Scanner;

import com.masai.exception.InvalidCharacterException;
import com.masai.service.ServiceImpl;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter character to check for vowel or consonant");
		String charValue = sc.next();


		try {
			String message = new ServiceImpl().checkVowel((charValue.toCharArray()[0]));
			
			System.out.println(message);
			
		} catch (InvalidCharacterException e) {
			
			System.out.println(e.getMessage());
		}
	
		sc.close();
		
	}
	
}
