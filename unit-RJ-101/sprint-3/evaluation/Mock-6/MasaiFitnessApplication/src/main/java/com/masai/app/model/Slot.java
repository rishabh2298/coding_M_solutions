package com.masai.app.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer slodId;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime startTime;
	
	@NotBlank(message = "Please dont pass blank values")
	@NotEmpty(message = "Please dont pass empty values")
	@NotNull(message = "Please dont pass null vaues")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime endTime;
	
	
	@OneToOne(mappedBy = "slot")
	@Valid
	private Member member;
	
	
	@ManyToOne
	@JoinColumn(name = "trainner_id")
	@Valid
	private Trainer trainer;
	
}
