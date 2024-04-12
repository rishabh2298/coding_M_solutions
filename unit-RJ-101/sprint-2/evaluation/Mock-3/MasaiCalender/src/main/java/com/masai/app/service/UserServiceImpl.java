package com.masai.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.EventNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.Event;
import com.masai.app.model.EventType;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;
import com.masai.app.repository.EventRepository;
import com.masai.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private LogInService logInService;
	
	
	
	
	
	@Override
	public User registerUser(User user) throws UserNotFoundException {
		
		Optional<User> existedUser = userRepository.findById(user.getEmail());
		
		if(existedUser.isPresent()) throw new UserNotFoundException("User with this ID already exist....");
		
		
		userRepository.save(user);
		
		return user;
	}
	

	
	@Override
	public String logInUser(LogIn logInDTO) throws UserNotFoundException {
		
		return logInService.logInUser(logInDTO);
		
	}
	
	
	@Override
	public List<Event> getEventDetails(String eventType)
			throws EventNotFoundException {

		EventType selectedEvent = EventType.valueOf(eventType.toUpperCase());
		
		List<Event> events = eventRepository.findByEventType(selectedEvent);
		
		return events;
	}

	
	@Override
	public User updateUserDetails(User user) throws UserNotFoundException {

		User existedUser = userRepository.findById(user.getEmail()).orElseThrow(() -> new UserNotFoundException("This user doesn't exist...."));
		
		return userRepository.save(user);
		
	}
	

}
