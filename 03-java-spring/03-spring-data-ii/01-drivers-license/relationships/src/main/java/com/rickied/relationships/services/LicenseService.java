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
		// adding the person repository as a dependency
	  	private LicenseRepository licenseRepo;
	    
	   
	    // returns all the persons
	    public List<License> getAll() {
	        return this.licenseRepo.findAll();
	    }
	    
	    // creates a license
	    public License createLicense(License newLicense) {
	        return licenseRepo.save(newLicense);
	    }
	    
	    
	    //Find a license
	    public License getSingleLicense(Long id) {
			return this.licenseRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
		}
	    
//	    public Double generateLicenseNumber() {
//			License lic = this.licenseRepo.findTopByOrderByNumberDesc();
//			if(lic == null) {
//				return (double) 1;
//			}
//			Double largestNumber = lic.getLicNumber();
//			largestNumber++;
//			return (largestNumber);
//				
//		}
	    
	    //Update a license
	    public License updatePerson(License updatedLicense) {
	    	return this.licenseRepo.save(updatedLicense);
	    }
	    
	    //Delete a license
		public void deleteById(Long id) {
	        this.licenseRepo.deleteById(id);
	        
	    }
}
