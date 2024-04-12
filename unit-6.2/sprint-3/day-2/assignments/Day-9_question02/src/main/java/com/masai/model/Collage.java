package com.masai.model;

public class Collage {

	private String collageName;
	private String collageAddress;
	private Student student;
	
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void showDetails(){
		System.out.println("Collage Name is :"+collageName);
		System.out.println("Collage Address is :"+collageAddress);
		System.out.println("Collage Student is :"+student);
		}


	@Override
	public String toString() {
		return "Collage [collageName=" + collageName + ", collageAddress=" + collageAddress + ", student=" + student
				+ "]";
	} 

}
