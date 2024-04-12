package com.masai.app.service;

import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.User;

public interface UserService {

	public User registerNewUser(User user) throws UserNotFoundException;
	
	
}
