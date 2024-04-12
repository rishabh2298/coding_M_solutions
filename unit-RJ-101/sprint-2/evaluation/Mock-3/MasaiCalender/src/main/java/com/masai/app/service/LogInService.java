package com.masai.app.service;

import com.masai.app.exception.LogInException;
import com.masai.app.model.LogIn;

public interface LogInService {
	
	public String logInUser(LogIn logInDTO) throws LogInException;
	
	public String logOutUser(LogIn logInDTO, String userKey) throws LogInException;

}
