package com.masai.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private Integer emailId;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private String toFirstName;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private String toLastName;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Size(min = 10, message="body should be alteast 10 characters")
	private String body;

	private boolean starred;
	
	
	
	@ManyToOne
	@JoinColumn(name = "sender_id")
	@Valid
	private User user;
	
}
