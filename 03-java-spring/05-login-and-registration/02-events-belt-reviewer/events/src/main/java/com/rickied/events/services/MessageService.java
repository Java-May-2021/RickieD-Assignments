package com.rickied.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.events.models.Message;
import com.rickied.events.repositories.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository mRepo;
	
	public List<Message> getAllMessages() {
		return this.mRepo.findAll();
	}
	
	public Message addMessage(Message message) {
		return this.mRepo.save(message);
	}
	
}
