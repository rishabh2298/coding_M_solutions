package com.masai.model;

public class Project {

	private int id;
	private String name;
	private String duration;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	
}
