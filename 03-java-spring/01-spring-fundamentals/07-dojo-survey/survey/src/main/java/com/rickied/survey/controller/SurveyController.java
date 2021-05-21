package com.rickied.survey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "survey.jsp";
	}
	@PostMapping("/result")
	public String result(@RequestParam(value="name") String name, @RequestParam(value="location") 
	String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, Model model) {
		model.addAttribute("name", name);
		System.out.println(name);
		
		model.addAttribute("location", location);
		System.out.println(location);
		
		model.addAttribute("language", language);
		System.out.println(language);
		
		model.addAttribute("comment", comment);
		System.out.println(comment);
		
		// Bonus challenge: Render a page for anyone who chooses "Java".
		if(language.equals("Java")) { 
			return "java.jsp";
		}
		
		return "result.jsp";
	}
}
