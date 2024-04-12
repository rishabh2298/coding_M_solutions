package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int courseId;
	
	private String courseName;

	private String duration;
	
	private double fee;
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ "]";
	}

}
