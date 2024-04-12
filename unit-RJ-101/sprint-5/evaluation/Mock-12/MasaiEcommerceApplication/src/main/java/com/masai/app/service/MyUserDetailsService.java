package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.app.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		com.masai.app.model.User user = userRepository.findByEmail(username);

		if(user != null) {
			
			return new User(user.getEmail(), user.getPassword(), null);
			
		}
		else {
			
			throw new BadCredentialsException("No User Details found with username: "+username);
		}
		
	}

}
