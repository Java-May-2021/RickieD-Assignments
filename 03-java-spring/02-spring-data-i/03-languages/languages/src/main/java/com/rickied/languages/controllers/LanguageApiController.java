package com.rickied.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rickied.languages.models.Language;
import com.rickied.languages.services.LanguageService;

@RestController
public class LanguageApiController {
private LanguageService languageService;
	
    public LanguageApiController(LanguageService service){
        this.languageService = service;
    }
    @RequestMapping("/api/languages")
    public List<Language> index() {
        return this.languageService.getAllLanguages();
    }
  //Get One Language
  	@RequestMapping("languages/{id}")  //Get Request
  	public Language getLanguage(@PathVariable("id") Long id) {
  		return this.languageService.getSingleLanguages(id);
  	}
  	
  	//Create A Language
  	@RequestMapping(value="/languages/create", method=RequestMethod.POST) //Post Request
  	public Language create(Language language) {
  		return this.languageService.createLanguage(language);
  	}
  	@RequestMapping(value="languages/destroy/{id}", method=RequestMethod.DELETE)
  	public void destroyBook(@PathVariable("id")Long id) {
  			this.languageService.destroyLanguage(id);
        }
  	
  	@PutMapping(value="/update/{id}")
  	public Language update(@PathVariable("id") Long id, Language updatedLanguage) {
  		return this.languageService.updateLanguage(updatedLanguage);
  	}
}
