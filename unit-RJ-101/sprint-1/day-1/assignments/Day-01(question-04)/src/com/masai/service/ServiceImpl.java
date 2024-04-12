package com.masai.service;

import com.masai.exception.InvalidCharacterException;

public class ServiceImpl {

	public String checkVowel(Character charValue) throws InvalidCharacterException {
		
		
		boolean result=false;
		
		
		// check for small alphabets
		for(int i=97; i<=122; i++) {
			if(charValue==(char)i) result=true;
		}
		
		// check for larger alphabet
		for(int i=65; i<=90; i++) {
			if(charValue==(char)i) result=true;
		}
		
		if(result==false) throw new InvalidCharacterException("This "+charValue+" is not a character, please pass valid character");
		
		
		
		if(charValue.toString().equalsIgnoreCase("a") || charValue.toString().equalsIgnoreCase("e")
				|| charValue.toString().equalsIgnoreCase("i") || charValue.toString().equalsIgnoreCase("o")
				|| charValue.toString().equalsIgnoreCase("u")) {
			return "This "+charValue+" is a vowel";
		}
		
	
		return "This "+charValue+" is consonant";
	
	}
	
}
