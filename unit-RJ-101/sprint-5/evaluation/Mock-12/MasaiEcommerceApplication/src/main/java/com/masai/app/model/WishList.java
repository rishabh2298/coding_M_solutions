package com.masai.app.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer whishListId;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String wishListName;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private Integer quantity;
	
	
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Valid
	private User user;			// uni-directinal (only user has this access)
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)		// user can modify
	private List<Product> items = new ArrayList<>();
	
	
}
