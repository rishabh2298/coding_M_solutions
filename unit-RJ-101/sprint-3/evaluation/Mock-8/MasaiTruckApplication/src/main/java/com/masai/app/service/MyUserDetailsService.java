package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
		
		
		Optional<com.masai.app.model.User> optional = userRepository.findById(username);

		if(optional.isPresent()) {
			
			com.masai.app.model.User user = optional.get();
			
			List<GrantedAuthority> authorities= new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(user.getRole()));
			
			return new User(user.getEmail(), user.getPassword(), authorities);
			
			
			
			
		}else
			throw new BadCredentialsException("No User Details found with username: "+username);
		
		
		
		
		
	}

}
