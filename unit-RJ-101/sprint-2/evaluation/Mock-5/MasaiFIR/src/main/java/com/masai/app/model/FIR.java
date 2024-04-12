package com.masai.app.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FIR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer firId;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	@Size(min=10, message = "please pass detailed information atleat of 10 characters")
	private String crimeDetial;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	private LocalDateTime timeStamp;

	@NotNull(message = "please don't pass null value")
	@NotBlank(message = "please don't pass blank values")
	@NotEmpty(message = "please don't pass empty values")
	private Boolean isOpen;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	@Valid
	private User applicant;
	
	@OneToMany(mappedBy = "fir", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@Valid
	private List<User> criminals;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Valid
	private Police officer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Valid
	private PoliceStation policeStation;
	
	
}
