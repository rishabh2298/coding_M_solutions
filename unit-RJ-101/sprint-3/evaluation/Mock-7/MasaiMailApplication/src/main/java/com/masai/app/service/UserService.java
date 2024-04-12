package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.LogInException;
import com.masai.app.exception.MailNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Mail;
import com.masai.app.model.User;

public interface UserService {

	public User registerNewUser(User user) throws UserNotFoundException;
	
	public String logInUser(LogIn logInDTO) throws LogInException;
	
	public List<Mail> getAllMailsOfUser(String userId) throws UserNotFoundException,MailNotFoundException;
	
	public List<Mail> getAllStarredMails(String userId) throws UserNotFoundException,MailNotFoundException;
	
	public User updateUser(User user) throws UserNotFoundException;
	
}
