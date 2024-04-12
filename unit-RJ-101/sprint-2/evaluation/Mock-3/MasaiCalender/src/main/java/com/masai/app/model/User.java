package com.masai.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@Email(message = "Please pass valid Email")
	@Column(unique = true)
	private String email;
	
	@Pattern(regexp = "^[A-Z][a-z]$", message = "please pass valid alphabets")
	private String firstName;
	
	@Pattern(regexp = "^[A-Z][a-z]$", message = "please pass valid alphabets")
	private String lastName;
	
	@Size(min = 10, max = 10, message = "mobile must have 10 digits")
	private String mobileNumber;
	
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	
	@Past
	private LocalDate dateOfBirth;
	
	

	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Event> events = new ArrayList<>();
	

}
