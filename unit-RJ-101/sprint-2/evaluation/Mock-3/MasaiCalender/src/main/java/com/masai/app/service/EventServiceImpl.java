package com.masai.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.EventNotFoundException;
import com.masai.app.model.Event;
import com.masai.app.repository.EventRepository;

public class EventServiceImpl implements EventService {
	
	
	@Autowired
	private EventRepository eventRepository;
	
	
	

	@Override
	public Event createEvent(Event event) throws EventNotFoundException {

		Optional<Event> events = eventRepository.findById(event.getEventId());
		
		if(events.isPresent()) throw new EventNotFoundException("This event already existed.....");
		
		return eventRepository.save(event);
		
	}


	@Override
	public Event deleteEvent(int eventId) throws EventNotFoundException {
		
		Event existedEvent = eventRepository.findById(eventId).orElseThrow(() -> new EventNotFoundException("No such Event Exist...."));
		
		eventRepository.delete(existedEvent);
		
		return existedEvent;
	}


	@Override
	public Event updateEvent(int eventId) throws EventNotFoundException {

		Optional<Event> event = eventRepository.findById(eventId);

		if(event.isPresent())
			return event.get();
		else
			throw new EventNotFoundException("No such Event exist....");
		
	}

}
