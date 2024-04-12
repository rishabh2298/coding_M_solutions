package com.masai.app.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer trainerId;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private String name;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Min(value = 16, message = "Age should be above 15 years")
	private Integer age;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}&", message="please pass digit's only that start's with(6-9) with size=10")
	@Size(min = 10, max = 10, message = "Size should by 10")
	@Column(unique = true)
	private String mobileNumber;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Pattern(regexp = "^[!,@,#,$,%,^,&,*]{1}[A-Z]{1}[a-z]{1}[0-9]{1}$")
	@Size(min = 6, max = 12, message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private Integer personalTrainingFee;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	private Integer salary;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime joinedOn;

	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@Enumerated(EnumType.STRING)
	private TrainerType trainerType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "trainer")
	private List<Member> members = new ArrayList<>() ;
	
	
	@Min(value = 2, message="Should have alteast two slots")
	@OneToMany(mappedBy = "trainer")
	private List<Slot> slots = new ArrayList<>();
	
	
}
