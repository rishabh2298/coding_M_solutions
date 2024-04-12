package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.LogInException;
import com.masai.app.model.CurrentLogInSession;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;
import com.masai.app.repository.CurrentLogInSessionRepository;
import com.masai.app.repository.UserRepository;

@Service
public class LogInServiceImpl implements LogInService {

	
	@Autowired
	private CurrentLogInSessionRepository currentLogInSessionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	

	private String generateUniqueUUID(int N) {
		
		String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"@#$%^&*()_+"+"abcdefghijklmnopqrstuvwxyz";
		
		
		StringBuilder uuid = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			
			int index = (int)(alphaNumeric.length() * Math.random());
			
			uuid.append(alphaNumeric.charAt(index));
		}
		
		return uuid.toString();
	}
	
	
	
	@Override
	public String logInUser(LogIn logInDTO) throws LogInException {
		
		Optional<CurrentLogInSession> existedUser = currentLogInSessionRepository.findById(logInDTO.getUserName());
		
		if(existedUser!=null) throw new LogInException("This user is already Logged-In");
		
		
		// if not login 
		
		User user = userRepository.findByEmail(logInDTO.getUserName());
		
		if(user==null) throw new LogInException("Please enter corrct user name");
		
		
		if(!user.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Please Enter correct password");
		
		
		
		// make session
		
		CurrentLogInSession logInSession = new CurrentLogInSession();
		
		logInSession.setUserName(logInDTO.getUserName());
		logInSession.setPassword(logInDTO.getPassword());
		
		String uuid = generateUniqueUUID(6);
		
		logInSession.setUuid(uuid);
		
		
		CurrentLogInSession logIn = currentLogInSessionRepository.save(logInSession);
		
		
		return "Logg-In successfull... "+logIn.toString();
		
	}

	@Override
	public String logOutUser(LogIn logInDTO, String userKey) throws LogInException {
		
		CurrentLogInSession currentUser = currentLogInSessionRepository.findById(logInDTO.getUserName()).orElseThrow(() -> new LogInException("This user is Not Logged-In yet"));
		
		if(!currentUser.getUuid().equals(userKey)) throw new LogInException("Please Enter correct unique user-key");
		
		
		currentLogInSessionRepository.delete(currentUser);
		
		return "User ="+logInDTO.getUserName()+" is Logged-Out successfully";
	}

}
