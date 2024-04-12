package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Tutorial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(max = 50, message = "max allowed Character is 50")
	private String title;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 200, message = "min allowed characters is 200")
	private String description;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private Boolean published;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tutorial", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();

	
	
	public Tutorial() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Tutorial(@NotNull @NotEmpty @NotBlank @Size(max = 50, message = "max allowed Character is 50") String title,
			@NotNull @NotEmpty @NotBlank @Size(min = 200, message = "min allowed characters is 200") String description,
			@NotNull @NotEmpty @NotBlank Boolean published, List<Comment> comments) {
		super();
		this.title = title;
		this.description = description;
		this.published = published;
		this.comments = comments;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Boolean getPublished() {
		return published;
	}



	public void setPublished(Boolean published) {
		this.published = published;
	}



	public List<Comment> getComments() {
		return comments;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}



	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ "]";
	}
	
}
