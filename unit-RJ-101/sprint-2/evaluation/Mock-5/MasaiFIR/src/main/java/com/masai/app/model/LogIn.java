package com.masai.app.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogIn {

	@NotNull(message = "Can't enter null value")
	@NotBlank(message = "Can't enter blank value")
	@NotEmpty(message = "Can't enter empty value")
	private String userName;
	
	@NotNull(message = "Can't enter null value")
	@NotBlank(message = "Can't enter blank value")
	@NotEmpty(message = "Can't enter empty value")
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}&", message="please pass digit's only that start's with(6-9)")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private LogInType userType;
	
}
