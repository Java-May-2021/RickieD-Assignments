package com.rickied.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.events.models.Event;
import com.rickied.events.models.User;
import com.rickied.events.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eRepo;
	
	public List<Event> getAllEvents(){
		return this.eRepo.findAll();
	}
	
	public Event getOneEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	
	public Event createEvent(Event event) {
		return this.eRepo.save(event);
	}
	
	public Event updateEvent(Event updatedEvent) {
		return this.eRepo.save(updatedEvent);
	}
	
	public void deleteEvent(Long id) {
		this.eRepo.deleteById(id);
	}
	
	public List<Event> allEventsWithState(String state) {
		return this.eRepo.findByState(state);
	}
	
	public List<Event> allEventsNotState(String state) {
		return this.eRepo.findByStateIsNot(state);
	}
	
	//join event
	public void joinedEvent(User user, Event event) {
		List<User> joinedUsers = event.getJoinedUsers();
		joinedUsers.add(user);
		this.eRepo.save(event);
	}
	
	//cancel
	public void cancelEvent(User user, Event event) {
		List<User> joinedUsers = event.getJoinedUsers();
		joinedUsers.remove(user);
		this.eRepo.save(event);
	}
}
