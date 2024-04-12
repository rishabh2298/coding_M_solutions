package com.masai.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.exception.EventNotFoundException;
import com.masai.app.model.Event;

@Service
public interface EventService {

	public Event createEvent(Event event) throws EventNotFoundException;
	
	public Event updateEvent(int eventId) throws EventNotFoundException;
	
	public Event deleteEvent(int eventId) throws EventNotFoundException;
	
}
