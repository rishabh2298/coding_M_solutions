package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coll_gen")
	@SequenceGenerator(name = "coll_gen", sequenceName = "collage_generator", initialValue = 50, allocationSize = 5)
	private int collageId;
	
	@Column(nullable = false)
	private String collageName;
	
	@Column(nullable = false)
	private String collageAddress;

	@OneToMany(mappedBy = "collage", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<>();

	
	
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ "]";
	}

}
