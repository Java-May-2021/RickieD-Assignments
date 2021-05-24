package com.rickied.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	//Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.
	@RequestMapping("/coding")
	public String index() {
		return "Hello Coding Dojo!";
	}
	//Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!
	@RequestMapping("coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	//Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.
	@RequestMapping("coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}
