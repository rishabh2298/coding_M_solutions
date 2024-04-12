package com.masai.app.service;

import com.masai.app.exception.TrainerNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Trainer;

public interface TrainerService {

	
	public Trainer registerNewTrainer(Trainer trainer) throws TrainerNotFoundException;
	
	public String logInTrainer(LogIn logInDTO) throws TrainerNotFoundException;
	
	public String logOutTrainer(LogIn logInDTO, String key) throws TrainerNotFoundException;
	
	public Trainer maxSalaryTrainer() throws TrainerNotFoundException;
	
}
