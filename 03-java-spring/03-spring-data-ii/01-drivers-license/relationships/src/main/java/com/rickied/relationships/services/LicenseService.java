package com.rickied.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.relationships.models.License;
import com.rickied.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	//Dependency injection
		@Autowired
		// adding the license repository as a dependency
	  	private LicenseRepository licenseRepo;
	    
	   
	    // returns all the license
	    public List<License> getAll() {
	        return this.licenseRepo.findAll();
	    }
	    
	    // creates a licenseNumber
	    public Integer createLicenseNumber() {
	       License lic = this.licenseRepo.findTopByOrderByNumberDesc();
	       if(lic == null) {
	    	   return 1;
	       }
	       int largestNumber = lic.getNumber();
	       largestNumber++;
	       return (largestNumber);
	    }
	    
	    public License createLicense(License newLicense) {
	    	newLicense.setNumber(this.createLicenseNumber());
	    	return this.licenseRepo.save(newLicense);
	    }
	    
	    //Find a license
	    public License getSingleLicense(Long id) {
			return this.licenseRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
		}
	    
	    
	    //Update a license
	    public License updatePerson(License updatedLicense) {
	    	return this.licenseRepo.save(updatedLicense);
	    }
	    
	    //Delete a license
		public void deleteById(Long id) {
	        this.licenseRepo.deleteById(id);
	        
	    }
}
