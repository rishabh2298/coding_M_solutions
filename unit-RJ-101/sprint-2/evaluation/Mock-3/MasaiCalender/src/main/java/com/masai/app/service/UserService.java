package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.EventNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.Event;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UserNotFoundException;

	public String logInUser(LogIn logInDTO) throws UserNotFoundException;
	
	public List<Event> getEventDetails(String eventType) throws EventNotFoundException;
	
	public User updateUserDetails(User user) throws UserNotFoundException;
	
	
}
