package com.masai.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
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
public class CabUser {

	@Id
	@Email
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String email;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Pattern(regexp = "^[a-zA-Z]$", message = "Please pass correct name only")
	private String firstName;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Pattern(regexp = "^[a-zA-Z]$", message = "Please pass correct name only")
	private String lastName;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message="please pass digit's only that start's with(6-9) with size=10")
	@Size(min = 10, max = 10, message = "Size should by 10")
	private String mobileNumber;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private Integer[] currentLocation;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private String role;
	
	
	
	@JsonIgnore			// after register can book cab
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cab_driverId")
	private CabDriver cabDriver;
	
}
