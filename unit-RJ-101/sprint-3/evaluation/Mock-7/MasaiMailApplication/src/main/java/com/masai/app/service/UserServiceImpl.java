package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.LogInException;
import com.masai.app.exception.MailNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Mail;
import com.masai.app.model.User;
import com.masai.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LogInService logInService;
	
	
	
	
	

	@Override
	public User registerNewUser(User user) throws UserNotFoundException {
		
		Optional<User> existedUser = userRepository.findById(user.getEmail());
	
		if(existedUser.isPresent()) throw new UserNotFoundException("This user="+user.getEmail()+" is already got registered...");
		
		
		return userRepository.save(user);
	}

	
	@Override
	public String logInUser(LogIn logInDTO) throws LogInException {

		return logInService.logInUser(logInDTO);
	}

	
	@Override
	public List<Mail> getAllMailsOfUser(String userId) throws UserNotFoundException, MailNotFoundException {
		
		User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("No such user found with this Id...."));
		
		List<Mail> mails = user.getMails();
		
		if(mails.isEmpty()) throw new MailNotFoundException("There is no mail for this user");
		
		return mails;
	}

	
	@Override
	public List<Mail> getAllStarredMails(String userId) throws UserNotFoundException, MailNotFoundException {

		User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("No such user found with this Id...."));
		
		List<Mail> mails = user.getMails();
		
		if(mails.isEmpty()) throw new MailNotFoundException("There is no mail for this user");
		

		List<Mail> starredMails = new ArrayList<>();
		
		mails.forEach(mail -> {
			if(mail.isStarred()) starredMails.add(mail);
		});
		
		if(starredMails.isEmpty()) throw new MailNotFoundException("No such starred mail found");
		
		return starredMails;
	}

	
	@Override
	public User updateUser(User user) throws UserNotFoundException {

		User existedUser = userRepository.findById(user.getEmail()).orElseThrow(()-> new UserNotFoundException("No such user found with this Id...."));
		
		return userRepository.save(user);
	}

}
