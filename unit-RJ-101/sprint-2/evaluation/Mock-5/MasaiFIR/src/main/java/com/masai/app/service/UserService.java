package com.masai.app.service;

import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.FIR;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UserNotFoundException;
	
	public String logInUser(LogIn logInDTO) throws UserNotFoundException;
	
	public FIR createFIR(FIR fir) throws UserNotFoundException;

}
