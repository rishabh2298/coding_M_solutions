package com.masai.app.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private Integer quantity;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	private String shippingAddress;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;
	
	@NotNull(message = "Please don't pass null values")
	@NotBlank(message = "Please don't pass blank values")
	@NotEmpty(message = "Please don't pass empty values")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;			// bi-directional so company has access to user of specific order
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)   // giving access to user
	private List<Product> items = new ArrayList<>();
	
}
