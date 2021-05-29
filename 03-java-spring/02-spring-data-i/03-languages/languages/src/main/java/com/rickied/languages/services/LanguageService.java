package com.rickied.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rickied.languages.models.Language;
import com.rickied.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	// adding the language repository as a dependency
	  private LanguageRepository languageRepo;
	    
	    public LanguageService(LanguageRepository repo) {
	        this.languageRepo = repo;
	    }
	    // returns all the languages
	    public List<Language> getAllLanguages() {
	        return this.languageRepo.findAll();
	    }
	    
	    // creates a language
	    public Language createLanguage(Language newLang) {
	        return languageRepo.save(newLang);
	    }
	   
	    public Language getSingleLanguages(Long id) {
			return this.languageRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
		}

		
		public Language updateLanguage(Language updatedLang) {
	        return this.languageRepo.save(updatedLang);
	    }
		
		public void destroyLanguage(Long id) {
	        this.languageRepo.deleteById(id);
	        
	    }
		
}
