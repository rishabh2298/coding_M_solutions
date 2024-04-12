package com.masai.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Product {
	
	@Id
	@Min(100)
	@NotNull
	private Integer id;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 14, message = "Length should be min=3 and max=14")
	private String name;
	
	private Integer price;
	
	@NotNull(message = "brand can't be null")
	@NotBlank
	@NotEmpty
	private String brand;
	
	@NotNull(message = "category can't be null")
	private String category;
	
	@JsonProperty("registration_number")
	private String registrationNumber;
	
	@JsonProperty("manufacturer_id")
	private String manufacturerId;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, Integer price, String brand, String category, String registrationNumber,
			String manufacturerId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registrationNumber = registrationNumber;
		this.manufacturerId = manufacturerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	
	
}
