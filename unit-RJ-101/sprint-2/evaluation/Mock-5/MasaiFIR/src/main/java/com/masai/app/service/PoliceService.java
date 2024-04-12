package com.masai.app.service;

import org.springframework.stereotype.Service;

import com.masai.app.exception.PoliceNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Police;

@Service
public interface PoliceService {
	
	public Police registerPolice(Police police) throws PoliceNotFoundException;
	
	public String logInPolice(LogIn logInDTO) throws PoliceNotFoundException;

}
