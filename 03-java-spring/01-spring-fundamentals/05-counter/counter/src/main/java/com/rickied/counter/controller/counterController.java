package com.rickied.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController {
	@RequestMapping("/")
	public String index(HttpSession session){
        // check if a key exists in session with the name "count"
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);
        }
        return "index.jsp";
    }
	@RequestMapping("/count")
	public String showCount(HttpSession session) {
		//first retrieve the current value in session, casting from Object to Integer
		Integer currentCount = (Integer) session.getAttribute("count");
		//increment count by 1
		currentCount++;
		// set the updated count value back into session
		session.setAttribute("count", currentCount);
	return "visit.jsp";
	}
	//Create a third page that will increment the counter by 2
	@RequestMapping("/recount")
	public String newCount(HttpSession session) {
		//first retrieve the current value in session, casting from Object to Integer
		Integer currentCount = (Integer) session.getAttribute("count");
		//increment count by 1
		currentCount+=2;
		// set the updated count value back into session
		session.setAttribute("count", currentCount);
	return "revisit.jsp";
	}
	// Create a reset button to set the counter back to zero
	@RequestMapping("/clear")
	public String clearCount(HttpSession session) {
		session.setAttribute("count", 0);// Will reset count to 0
		return "redirect:/count";
	}

}