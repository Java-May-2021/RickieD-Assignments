package com.rickied.relationships.controllers;

import java.util.Date;
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

import com.rickied.relationships.models.License;
import com.rickied.relationships.models.Person;
import com.rickied.relationships.services.LicenseService;
import com.rickied.relationships.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private PersonService personService;
	@Autowired
	private LicenseService licenseService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/new/person")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newPerson.jsp";
		}else {
			this.personService.createPerson(person);
			System.out.println(person.getFirstName() + " " +  person.getLastName() + " has been added!");
		}
		return "redirect:/license/new";
	}
	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> allPersons = personService.getAll();
		model.addAttribute("allPersons", allPersons);
		return "newLicense.jsp";
	}
	
	@PostMapping("/license/create")
	public String createLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if(result.hasErrors()) {
			return "newLicense.jsp";
		}else {
			License newLicense = this.licenseService.createLicense(license);
			Long newLicensePersonId = newLicense.getPerson().getId();//Gets id
			return "redirect:/details/" + newLicensePersonId;
		}
	}
	@GetMapping("/details/{id}")
	public String details(@PathVariable("id") @ModelAttribute("license") Long id, Model model, Integer licenseNumber) {
		License license = licenseService.getSingleLicense(id);
		
		if(license != null) {
			Date expireDate = license.getExpirationDate();
			model.addAttribute("person", this.personService.getSinglePerson(id));
//			model.addAttribute("licenseNumber", this.licenseService.generateLicenseNumber());
			model.addAttribute("license", license);
			model.addAttribute("expDate", expireDate);
			return "viewPerson.jsp";
			
		}
		model.addAttribute("person", this.personService.getSinglePerson(id));
		return "viewPerson.jsp";
	}
}
