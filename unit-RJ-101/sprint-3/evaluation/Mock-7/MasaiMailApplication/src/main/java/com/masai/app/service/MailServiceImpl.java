package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.MailNotFoundException;
import com.masai.app.model.Mail;
import com.masai.app.repository.MailRepository;

@Service
public class MailServiceImpl implements MailService {
	
	
	@Autowired
	private MailRepository mailRepository;
	
	
	
	
	
	

	@Override
	public Mail sendMail(Mail mail) throws MailNotFoundException {
		
		mailRepository.findById(mail.getEmailId()).orElseThrow(() -> new MailNotFoundException("This mail is already send want to repeat....."));
		
		return mailRepository.save(mail);
	}
	
	

	@Override
	public Mail starredMail(Mail mail) throws MailNotFoundException {
		
		mailRepository.findById(mail.getEmailId()).orElseThrow(() -> new MailNotFoundException("This mail doesn't exist....."));
		
		if(mail.isStarred()) throw new MailNotFoundException("This mail is already starred...want to undo...");
		
		mail.setStarred(true);
		
		return mailRepository.save(mail);
	}


	
	@Override
	public Mail deleteMail(Integer mailId) throws MailNotFoundException {

		Mail existedMail = mailRepository.findById(mailId).orElseThrow(() -> new MailNotFoundException("This mail doesn't exist....."));
		
		mailRepository.delete(existedMail);
		
		return existedMail;
	}

	
	
}
