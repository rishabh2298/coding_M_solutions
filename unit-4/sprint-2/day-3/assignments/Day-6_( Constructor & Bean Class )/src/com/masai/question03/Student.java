package com.masai.question03;

public class Student {
	
	
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	
	
	Student(){
		// to access getter and setter;
	}
	
	Student(int roll, String name, String address){
		this.collageName = "N.I.T.";
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	Student(int roll, String name, String address, String collageName){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	
	
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT == true) {
			Student student = new Student( 0, null, null);
			return student;
		}
		else {
			Student student = new Student (0,null,null,null);
			return student;
		}
		
	}

}



