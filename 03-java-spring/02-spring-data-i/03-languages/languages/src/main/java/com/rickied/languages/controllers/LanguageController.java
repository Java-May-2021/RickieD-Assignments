package com.rickied.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rickied.languages.models.Language;
import com.rickied.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	//The GET /languages route should show a table of all the languages with links to edit and delete the languages; also include a form for creating new languages.
	//Get All Languages
	
	@GetMapping("/languages")
	public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> allLanguages = this.languageService.getAllLanguages();
		model.addAttribute("allLanguages", allLanguages);
		return "dashboard.jsp";
	}
	
	@GetMapping("/languages/create")
	public String createLanguage(@ModelAttribute("language") Language language, Model model) {
		return "redirect:/languages";
	}
	@PostMapping("/languages")
	public String addLang(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
	System.out.println(language.getVersion());
	if(result.hasErrors()) {
		return "dashboard.jsp";
	}
	this.languageService.createLanguage(language);
	System.out.println("New language created.");
		
	return "redirect:/languages";
	}
		
	//The GET /languages/{id} route should return the specific language and details.
	//Get One Language (Read)
	@GetMapping("/languages/view/{id}")
	public String findById(@ModelAttribute("language") Language language, Model model, @PathVariable("id") Long id) {
		Language singleLanguage = this.languageService.getSingleLanguages(id);
		model.addAttribute("language", singleLanguage);
		return "showLang.jsp";
	}
	//The GET /languages/{id}/edit route should show the edit page to of a specific language
	//Update A Language
	@GetMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, Model model, @ModelAttribute("lanuage") Language language) {
		model.addAttribute("language", languageService.getSingleLanguages(id));
		return "editLang.jsp";
	}
	@PostMapping("languages/update/{id}")
	public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
		Long languageId = language.getId();
		if(result.hasErrors()) {			//All routes should be validated and show errors.
			return "editLang.jsp";
		}
		this.languageService.updateLanguage(language);
		System.out.println("Language Successfully Updated!");
		return "redirect:/languages";
	}
	//The DELETE /languages/{id} route should delete the specific language at that id.
	//Delete A Language
	@GetMapping("/languages/destroy/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.languageService.destroyLanguage(id);
		System.out.println("Language deleted.");
		return "redirect:/languages";
		}
	
}

