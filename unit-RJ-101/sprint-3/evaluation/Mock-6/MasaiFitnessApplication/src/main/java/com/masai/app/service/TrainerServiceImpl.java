package com.masai.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.MemberNotFoundException;
import com.masai.app.exception.TrainerNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Trainer;
import com.masai.app.repository.CurrentLogInSessionRepository;
import com.masai.app.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService {

	

	@Autowired
	private LogInService logInService;
	
	@Autowired
	private CurrentLogInSessionRepository currentLogInSessionRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	
	
	
	
	
	
	@Override
	public Trainer registerNewTrainer(Trainer trainer) throws TrainerNotFoundException {

		Optional<Trainer> existedMember = trainerRepository.findById(trainer.getTrainerId());
		
		if(existedMember.isPresent()) throw new MemberNotFoundException("This trainer is already registerd.....");
		
		return trainerRepository.save(trainer);
	}

	
	
	@Override
	public String logInTrainer(LogIn logInDTO) throws TrainerNotFoundException {

		return logInService.userLogIn(logInDTO);
	}

	
	
	@Override
	public String logOutTrainer(LogIn logInDTO, String key) throws TrainerNotFoundException {

		return logInService.userLogOut(logInDTO, key);
	}

	
	
	@Override
	public Trainer maxSalaryTrainer() throws TrainerNotFoundException {
		
		List<Trainer> trainers = trainerRepository.findAll();
		
		if(trainers.isEmpty()) throw new TrainerNotFoundException("There is no such trainer present in Data....");
		
		Integer maxSalary = 0;
		
		for(Trainer tra : trainers) {
			
			maxSalary = Math.max(maxSalary, tra.getSalary());
			
		}
		
		Trainer result = null;


		for(Trainer tra : trainers) {
			
			if(maxSalary==tra.getSalary()) {
				result = tra;
				break;
			}
			
		}
		
		return result; 
		
	}

}
