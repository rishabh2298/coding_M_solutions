package com.masai.app.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
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
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Column(unique = true)
	private String email;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	
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
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Min(value = 16, message = "Age must be above 15 years")
	private Integer age;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String address;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String city;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String state;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private Integer zipcode;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String country;
	
	
	
	@OneToOne
	@Valid
	private Cart cart;				// access to products from cart (uni-directional)
	
	
	
	// can have access after registration
	
	@JsonIgnore				// bi-directional
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Order> orders = new ArrayList<>();
	
	
	@JsonIgnore
	@OneToMany
	private List<WishList> wishLists = new ArrayList<>();
	
}
