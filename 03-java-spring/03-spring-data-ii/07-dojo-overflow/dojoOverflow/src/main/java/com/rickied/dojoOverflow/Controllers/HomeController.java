package com.rickied.dojoOverflow.Controllers;


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

import com.rickied.dojoOverflow.Models.Answer;
import com.rickied.dojoOverflow.Models.Question;
import com.rickied.dojoOverflow.Models.Tag;
import com.rickied.dojoOverflow.Services.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/questions")
	public String dashboard(@ModelAttribute("quest") Question question, @ModelAttribute("tags") Tag tags, Model model) {
		List<Question> allQuestions = this.homeService.getAllQuestions();
		List<Tag> allTags = this.homeService.getAllTags();
		model.addAttribute("allQuestions", allQuestions);
		model.addAttribute("allTags", allTags);
		return "dashboard.jsp";
	}
	
	@GetMapping("/new/question")
	public String newQuestion(@ModelAttribute("quest") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/new/questions")
	public String createQuestion(@Valid @ModelAttribute("quest") Question question, BindingResult result, Tag tag, Model model) {
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}
		this.homeService.createQuestion(question);
		System.out.println(question.getQuestion() + ", has been created");
		return "redirect:/questions";
	}
	
	@GetMapping("/question/{id}")
	public String showQuestion(@PathVariable("id") Long id, @ModelAttribute("ans") Answer answer, Model model) {
		Long questionId = id;
		List<Answer> allAnswers = this.homeService.getAllAnswers();
		model.addAttribute("question", this.homeService.getOneQuestion(questionId));
		model.addAttribute("allAnswers", this.homeService.getAllAnswers());
		return "profile.jsp";
	}
	
	@PostMapping("/answers")
	public String createAnswers(@Valid @ModelAttribute("ans") Answer answer, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "profile.jsp";
		}
		this.homeService.createAnswer(answer);
		System.out.println(answer.getQuestion());
		return "redirect:/question/" + answer.getQuestion().getId();
	}
}
