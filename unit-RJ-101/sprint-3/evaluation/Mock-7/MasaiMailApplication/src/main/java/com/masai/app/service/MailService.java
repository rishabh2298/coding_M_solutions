package com.masai.app.service;

import com.masai.app.exception.MailNotFoundException;
import com.masai.app.model.Mail;

public interface MailService {

	public Mail sendMail(Mail mail) throws MailNotFoundException;
	
	public Mail starredMail(Mail mail) throws MailNotFoundException;
	
	public Mail deleteMail(Integer mailId) throws MailNotFoundException;
	
}
