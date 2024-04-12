package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.FIRNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.FIR;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;
import com.masai.app.repository.FirRepository;
import com.masai.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LogInService logInService;
	
	@Autowired
	private FirRepository firRepository;
	
	
	
	
	
	@Override
	public User registerUser(User user) throws UserNotFoundException {
		
		Optional<User> existedUser = userRepository.findById(user.getUserId());
		
		if(existedUser.isPresent()) throw new UserNotFoundException("This user is already present");
		
		return userRepository.save(user);
		
	}

	@Override
	public String logInUser(LogIn logInDTO) throws UserNotFoundException {
		
		return logInService.userLogIn(logInDTO);
	}

	@Override
	public FIR createFIR(FIR fir) throws UserNotFoundException {
		
		Optional<FIR> existedFir = firRepository.findById(fir.getFirId());
		
		if(existedFir.isPresent()) throw new FIRNotFoundException("This fir already existed. If want update previous one....");
		
		return firRepository.save(fir);
		
	}

}
