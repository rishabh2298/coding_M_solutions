package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.User;
import com.masai.app.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	

	@Override
	public User registerNewUser(User user) throws UserNotFoundException {
		
		userRepository.findById(user.getEmail()).orElseThrow(() -> new UserNotFoundException("This user is not registerd yet..."));
		
		return userRepository.save(user);
	}
	

}
