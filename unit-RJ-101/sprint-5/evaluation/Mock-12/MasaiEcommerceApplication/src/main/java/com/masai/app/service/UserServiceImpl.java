package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.User;
import com.masai.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	@Override
	public User registerUser(User user) throws UsernameNotFoundException {
		
		User existedUser = userRepository.findByEmail(user.getEmail());
		
		if(existedUser != null) throw new UserNotFoundException("User with this email Id already exist.... please login..");
		
		return userRepository.save(user);
	}

	
}
