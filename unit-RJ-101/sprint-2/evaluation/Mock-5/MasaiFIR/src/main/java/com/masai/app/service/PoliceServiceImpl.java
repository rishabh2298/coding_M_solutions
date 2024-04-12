package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.PoliceNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Police;
import com.masai.app.repository.PoliceRepository;

@Service
public class PoliceServiceImpl implements PoliceService {
	
	@Autowired
	private PoliceRepository policeRepository;
	
	
	@Autowired
	private LogInService logInService;
	
	
	
	

	@Override
	public Police registerPolice(Police police) throws PoliceNotFoundException {
		
		Optional<Police> existedPolice = policeRepository.findById(police.getPoliceId());
		
		if(existedPolice.isPresent()) throw new PoliceNotFoundException("This police is already existed...");
		
		return policeRepository.save(police);
		
	}

	@Override
	public String logInPolice(LogIn logInDTO) throws PoliceNotFoundException {

		return logInService.userLogIn(logInDTO);
	}

}
