package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.LogInException;
import com.masai.app.model.CurrentLogInSession;
import com.masai.app.model.LogIn;
import com.masai.app.model.LogInType;
import com.masai.app.model.Member;
import com.masai.app.model.Trainer;
import com.masai.app.repository.CurrentLogInSessionRepository;
import com.masai.app.repository.MemberRepository;
import com.masai.app.repository.TrainerRepository;

@Service
public class LogInServiceImpl implements LogInService {

	
	@Autowired
	private CurrentLogInSessionRepository currentLogInSessionRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	
	
	
	

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
		
		
		// checking string with ENUM (by converting string -> enum )
		
		if(LogInType.valueOf(logInDTO.getUserType().toUpperCase()).equals(LogInType.MEMBER)) {
			
			Member member = memberRepository.findByMobileNumber(logInDTO.getUserName());
			
			if(member==null) throw new LogInException("User Name is not valid....");
			
			if(!member.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Your password is wrong, please enter correct one...");
			
			
			CurrentLogInSession logInSession = new CurrentLogInSession();
			
			logInSession.setUserName(logInDTO.getUserName());
			logInSession.setPassword(logInDTO.getPassword());
			
			String uuid = generateUniqueUUID(6);
			
			logInSession.setUserName(uuid);
			
			
			CurrentLogInSession logIn = currentLogInSessionRepository.save(logInSession);
			
			return "Logg-In Successfull ! "+logIn.toString();
			
		}
		else {

			Trainer trainer = trainerRepository.findByMobileNumber(logInDTO.getUserName());
			
			if(trainer==null) throw new LogInException("Trainer Name is not valid....");
			
			if(!trainer.getPassword().equals(logInDTO.getPassword())) throw new LogInException("Your password is wrong, please enter correct one...");
			
			
			CurrentLogInSession logInSession = new CurrentLogInSession();
			
			logInSession.setUserName(logInDTO.getUserName());
			logInSession.setPassword(logInDTO.getPassword());
			
			String uuid = generateUniqueUUID(6);
			
			logInSession.setUserName(uuid);
			
			
			CurrentLogInSession logIn = currentLogInSessionRepository.save(logInSession);
			
			return "Logg-In Successfull ! "+logIn.toString();
		}
		
	}

	
	
	@Override
	public String userLogOut(LogIn logInDTO, String key) throws LogInException {
		
		Optional<CurrentLogInSession> existedUser = currentLogInSessionRepository.findById(logInDTO.getUserName());
		
		if(!existedUser.isPresent()) throw new LogInException("This user is not logged-in yet....");
		
		if(!logInDTO.getPassword().equals(existedUser.get().getPassword())) throw new LogInException("Please pass correct password.....");
		
		
		
		CurrentLogInSession currentUser = currentLogInSessionRepository.findByUuid(key);
		
		if(currentUser==null) throw new LogInException("Please pass correct user-key.....");
		
		currentLogInSessionRepository.delete(currentUser);
		
		return logInDTO.getUserName()+" is logged-Out successfully....";
	}

}
