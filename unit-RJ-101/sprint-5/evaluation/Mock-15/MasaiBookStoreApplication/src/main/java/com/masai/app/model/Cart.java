package com.masai.app.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Cart {

	@Id
	private Integer cartId;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private Integer total;
	
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private LocalDateTime dateTime;
	
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@Valid
	private User user;
	
	
	@OneToMany
	@Valid
	private Set<Book> books = new HashSet<>();
	
}
