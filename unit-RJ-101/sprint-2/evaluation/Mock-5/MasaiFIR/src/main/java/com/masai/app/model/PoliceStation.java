package com.masai.app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
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
public class PoliceStation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String stationCode;
	
	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	private String address;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	
	@OneToOne
	@Valid
	private Police officerInCharge;
	
	@JsonIgnore
	@OneToMany(mappedBy = "policeStation")
	private List<Police> constables;
	
	@JsonIgnore
	@OneToMany(mappedBy = "policeStation")
	private List<FIR> firList;
	
}
