package com.rickied.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
	public String index() {
		return "The Dojo is awesome!";
	}
	//Have an http GET request to 'http://localhost:8080/dojo/burbank' display a text that says 'Burbank Dojo is located in Southern California'.
	@RequestMapping("/{city}")
	public String burbank(@PathVariable("city") String city) {
		if(city.equals("burbank")) {
		return "Burbank Dojo is located in Southern California.";
		}//Have an http GET request to 'http://localhost:8080/dojo/san-jose' display a text that says 'SJ dojo is the headquarters'.
		else if(city.equals("san-jose")) {
		return "SJ dojo is the headquarters.";
	}else {
		return "";
		}
	}
}
	
		
