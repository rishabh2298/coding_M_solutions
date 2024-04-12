package com.masai.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Pattern(regexp = "^[A-Z][a-z]&", message="please pass character only")
	private String firstName;
	
	@Pattern(regexp = "^[A-Z][a-z]&", message="please pass character only")
	private String lastName;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}&", message="please pass digit's only that start's with(6-9)")
	private String mobileNumber;
	
	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	@Size(min=10, message = "please pass detailed address")
	private String address;
	
	@Min(value = 12, message = "age must be above 12 years")
	private Integer age;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	@Size(min=10, message = "please pass detailed address")
	private String gender;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "criminal_fir_id")
	private FIR fir;

}
