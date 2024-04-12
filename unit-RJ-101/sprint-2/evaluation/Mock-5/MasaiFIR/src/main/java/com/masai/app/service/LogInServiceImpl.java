package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.LogInException;
import com.masai.app.model.CurrentLogInSession;
import com.masai.app.model.LogIn;
import com.masai.app.model.Police;
import com.masai.app.model.PoliceStation;
import com.masai.app.model.User;
import com.masai.app.repository.CurrentLogInSessionRepository;
import com.masai.app.repository.PoliceRepository;
import com.masai.app.repository.PoliceStationRepository;
import com.masai.app.repository.UserRepository;

public class LogInServiceImpl implements LogInService {
	
	
	@Autowired
	private CurrentLogInSessionRepository currentLogInSessionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PoliceRepository policeRepository;
	
	@Autowired
	private PoliceStationRepository policeStationRepository;
	
	
	
	
	

	// to generate unique key
	
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
	public String userLogIn(LogIn logInDTO) throws LogInException {
		
		Optional<CurrentLogInSession> existedUser = currentLogInSessionRepository.findById(logInDTO.getUserName());
		if(existedUser.isPresent()) {
			throw new LogInException("This user="+logInDTO.getUserName().toString()+" is already Logged-In");
		}
		

//		if not logged-in
		
		if(logInDTO.getUserType().toString().equals("USER")) {
			
			User user = userRepository.findByMobileNumber(logInDTO.getUserName());
			
			if(user==null) throw new LogInException("This user doesn't exist....");
			
			if(!user.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Please enter valid password");
			
			
			CurrentLogInSession currentLogInSession = new CurrentLogInSession();
			currentLogInSession.setUserName(logInDTO.getUserName());
			currentLogInSession.setPassword(logInDTO.getPassword());
			
			String uuid = generateUniqueUUID(6);
			
			currentLogInSession.setUuid(uuid);
			
			CurrentLogInSession logInSession = currentLogInSessionRepository.save(currentLogInSession);
			
			return "Logg-In Successfull ! "+logInSession.toString();
			
		}
		else if(logInDTO.getUserType().toString().equals("POLICE")) {

			Police police = policeRepository.findeByMobileNo(logInDTO.getUserName());
			
			if(police==null) throw new LogInException("This Police doesn't exist....");
			
			if(!police.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Please enter valid password");
			
			
			CurrentLogInSession currentLogInSession = new CurrentLogInSession();
			currentLogInSession.setUserName(logInDTO.getUserName());
			currentLogInSession.setPassword(logInDTO.getPassword());
			
			String uuid = generateUniqueUUID(6);
			
			currentLogInSession.setUuid(uuid);
			
			CurrentLogInSession logInSession = currentLogInSessionRepository.save(currentLogInSession);
			
			return "Logg-In Successfull ! "+logInSession.toString();
		}
		else {

			PoliceStation policeStation = policeStationRepository.findById(logInDTO.getUserName()).orElseThrow(() -> new LogInException("This police station already logged-In..."));
			
			if(policeStation==null) throw new LogInException("This Police doesn't exist....");
			
			if(!policeStation.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Please enter valid password");
			
			
			CurrentLogInSession currentLogInSession = new CurrentLogInSession();
			currentLogInSession.setUserName(logInDTO.getUserName());
			currentLogInSession.setPassword(logInDTO.getPassword());
			
			String uuid = generateUniqueUUID(6);
			
			currentLogInSession.setUuid(uuid);
			
			CurrentLogInSession logInSession = currentLogInSessionRepository.save(currentLogInSession);
			
			return "Logg-In Successfull ! "+logInSession.toString();
		}
		
		
	}

	@Override
	public String userLogOut(LogIn logInDTO, String key) throws LogInException {
		
		currentLogInSessionRepository.findById(logInDTO.getUserName()).orElseThrow(() -> new LogInException("Please Logged-In first"));
		
		CurrentLogInSession existedUser = currentLogInSessionRepository.findByUuid(key);
		

		if(existedUser==null) throw new LogInException("Please enter correct key to LoggOut....");
		
		
		currentLogInSessionRepository.delete(existedUser);
		
		
		return null;
	}

}
