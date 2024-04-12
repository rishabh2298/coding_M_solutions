package com.masai.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String productName;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String description;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private Integer price;
	
	
	
}
