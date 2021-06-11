package com.rickied.dojoOverflow.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.dojoOverflow.Models.Answer;
import com.rickied.dojoOverflow.Models.Question;
import com.rickied.dojoOverflow.Models.Tag;
import com.rickied.dojoOverflow.Repositories.AnswerRepository;
import com.rickied.dojoOverflow.Repositories.QuestionRepository;
import com.rickied.dojoOverflow.Repositories.TagRepository;

@Service
public class HomeService {
	@Autowired
	private QuestionRepository questRepo;
	
	@Autowired
	private AnswerRepository ansRepo;
	
	@Autowired
	private TagRepository tagRepo;
	
	public List<Question> getAllQuestions() {
		return this.questRepo.findAll();
	}
	
	public List<Answer> getAllAnswers() {
		return this.ansRepo.findAll();
	}
	
	public List<Tag> getAllTags() {
		return this.tagRepo.findAll();
	}
	
	public Question createQuestion(Question newQuestion) {
		return this.questRepo.save(newQuestion);
	}
	
	public Answer createAnswer(Answer newAnswer) {
		return this.ansRepo.save(newAnswer);
	}
	
	public Tag createTag(Tag newTag) {
		return this.tagRepo.save(newTag);
	}
	
	public Question getOneQuestion(Long id) {
		return this.questRepo.findById(id).orElse(null);
	}
	
	public Answer getOneAnswer(Long id) {
		return this.ansRepo.findById(id).orElse(null);
	}
	
	public Tag getOneTag(Long id) {
		return this.tagRepo.findById(id).orElse(null);
	}
	
	public Question addQuestion(Question question) {
		ArrayList<Tag> questionsTags = new ArrayList<Tag>();
		String tags = question.getTags();
		
		String[] qTags = tags.split(",");
		
		for(String subject: qTags) {
			System.out.println(subject);
			Tag tag = this.tagRepo.findBySubject(subject.toLowerCase().trim());
			if(tag == null) {
				tag = new Tag(subject);
				tag.setSubject(subject);
				this.tagRepo.save(tag);
			}
			
			if(!questionsTags.contains(tag)) {
				questionsTags.add(tag);
			}
		}
		
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		return this.questRepo.save(null);
	}
	
	public Answer addAnswer(Answer answer) {
		return this.ansRepo.save(answer);
	}
	
	public Tag addTag(Tag tag) {
		return this.tagRepo.save(tag);
	}
	
}
