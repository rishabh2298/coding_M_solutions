package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(query = "select s from Student s where s.status='true'", name = "Student.activeStudents"),
	@NamedQuery(query = "select s.college from Student s where s.studentRoll=:roll", name = "Student.college")
})
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;
	private boolean status;
	
	@ManyToOne
	private College college;

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
	
}
