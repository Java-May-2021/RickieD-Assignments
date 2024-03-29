package com.rickied.dojoOverflow.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="answers")
public class Answer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
    private String answer;
	
    @Column(updatable=false)
    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PrePersist //do this before anything -- Callback
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate //do this before anything
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
   
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="question_id")
    
    private Question question;
    
    
   
    public Answer() {
    	
    }

    public Long getId() {
    	return id;
    }

    public void setId(Long id) {
    	this.id = id;
    }

    public String getAnswer() {
    	return answer;
    }

    public void setAnswer(String answer) {
    	this.answer = answer;
    }

    public Date getCreatedAt() {
    	return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
    	this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
    	return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
    	this.updatedAt = updatedAt;
    }
    public Question getQuestion() {
    	return question;
    }

    public void setQuestion(Question question) {
    	this.question = question;
    }
    

}
