package com.masai.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.masai.model.Developer;
import com.masai.model.Project;

public class DeveloperService {
	
	
	private Map<Developer, Project> projectMap = new HashMap<>();
	
	private List<Developer> developerList = new ArrayList<>();
	
	
	
	
	
	
	public void printProjectMap() {
		
		for(Map.Entry<Developer, Project> map : projectMap.entrySet()) {
			
			System.out.println(map.getKey());
			System.out.println(map.getValue());
			
			System.out.println("===========================================");
		}
		
	}
	
	
	
	public void printDeveloperList() {
		
		// sorting
		
		Collections.sort(developerList, ((s1,s2)->{
			
			if(s2.getNoOfProjectsDone() > s1.getNoOfProjectsDone()) {
				return 1;
			}
			else if(s2.getNoOfProjectsDone()==s1.getNoOfProjectsDone()) {
				if(s2.getAge() > s1.getAge()) {
					return 1;
				}
			}
			else {
				return -1;
			}
			
			return -1;
			
		}));
		
		
		
		// all developers
		
		developerList.forEach(developer -> System.out.println(developer));
		
	}

}
