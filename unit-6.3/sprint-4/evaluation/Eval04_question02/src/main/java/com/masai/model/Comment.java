package com.masai.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String content;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@Valid
	private Tutorial tutorial;

	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tutorial getTutorial() {
		return tutorial;
	}

	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}



	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", tutorial=" + tutorial + "]";
	}

	
}
