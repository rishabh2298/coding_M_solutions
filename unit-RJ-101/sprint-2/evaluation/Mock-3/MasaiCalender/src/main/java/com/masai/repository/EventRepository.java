package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Event;
import com.masai.app.model.EventType;
import com.masai.app.model.User;

@Repository
public interface EventRepository extends JpaRepository<EventRepository, Integer> {

	public List<Event> findByUser(User user);
	
	public List<Event> findByEventType(EventType eventType);
	
}
