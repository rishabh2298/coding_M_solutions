package com.masai.app.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.app.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UsernameNotFoundException;
	
}
