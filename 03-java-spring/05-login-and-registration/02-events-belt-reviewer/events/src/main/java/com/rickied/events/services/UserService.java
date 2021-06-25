package com.rickied.events.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.events.models.User;
import com.rickied.events.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	//Register user
	public User registration(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.uRepo.save(user);
	}
	//find user by email
	public User findByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	//find user by id
	public User findById(Long id) {
		Optional<User> user = this.uRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}else {
			return null;
		}
	}
	
	//authenticate user
	public boolean authenticateUser(String email, String password) {
		//find user by email
		User user = this.uRepo.findByEmail(email);
		//if user can't be found by email, return false
		if(user == null) {
			return false;
		} else {
			//if the password match, return true, else, return false
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	//get all
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	//get one user
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
}
