package com.masai.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.masai.model.Person;
import com.masai.model.Skill;

public class PersonService {
	
	private Map<Person, Skill> skillMap = new HashMap<>();
	
	private List<Person> personList = new ArrayList<>() ;
	
	
	
	public void printSkillMap() {
		
		for(Map.Entry<Person, Skill> details : skillMap.entrySet()) {
			System.out.println();
			System.out.println(details.getKey());
			System.out.println(details.getValue());
			System.out.println();
			System.out.println("========================");
		}
	}
	
	
	public void printPersonList() {
		
		Collections.sort(personList, ((person1,person2) -> person1.getAge() <= person2.getAge() ? 1 : -1));
		
		personList.forEach(person -> System.out.println(person));
		
	}

}
