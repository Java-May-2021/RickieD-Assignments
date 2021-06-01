package com.rickied.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.relationships.models.Person;
import com.rickied.relationships.repositories.PersonRepository;


@Service
public class PersonService {
	//Dependency injection
	@Autowired
	// adding the person repository as a dependency
  	private PersonRepository personRepo;
    
   
    // returns all the persons
    public List<Person> getAll() {
        return this.personRepo.findAll();
    }
    
    // creates a person
    public Person createPerson(Person newPerson) {
        return personRepo.save(newPerson);
    }
    
    //Find a person
    public Person getSinglePerson(Long id) {
		return this.personRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}
    
    //Update a person
    public Person updatePerson(Person updatedPerson) {
    	return this.personRepo.save(updatedPerson);
    }
    
    //Delete a person
	public void deleteById(Long id) {
        this.personRepo.deleteById(id);
        
    }
	
}
