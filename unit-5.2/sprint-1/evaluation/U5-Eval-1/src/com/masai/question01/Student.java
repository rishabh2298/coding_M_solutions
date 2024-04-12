package com.masai.question01;

public class Student {
	
	private int studentId;
	private String studentName;
	private int StudentMarks;
	
	public Student(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentMarks = studentMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return StudentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		StudentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentMarks=" + StudentMarks
				+ "]";
	}

}
