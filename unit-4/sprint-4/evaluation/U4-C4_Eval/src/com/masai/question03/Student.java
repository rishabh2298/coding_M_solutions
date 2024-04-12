package com.masai.question03;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	private int totalMarks;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
		this.totalMarks = mathsMarks+scienceMarks+engMarks;
	}
	
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub

		if(this.totalMarks > s2.totalMarks) {
			return 1;
		}
		else if(this.totalMarks < s2.totalMarks) {
			return -1;
		}
//		else if(this.name.compareTo(s2.name)){
//			return -1;
//		}
//		else if(this.name.compareTo(s2.name)) {
//			return 1;
//		}
		else if(this.rollNo>s2.rollNo) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}
	
}
