package com.masai.model;

public class Skill {

	private int id;
	private String name;
	private double yearOfExperience;
	
	public Skill() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", yearOfExperience=" + yearOfExperience + "]";
	}
	
}
