package com.rickied.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Size(min = 4, max = 30, message="Name must contatin at least four characters")
    private String name;
    @Column
    @Size(min = 5, max = 30, message="Creator must contain at least five characters")
    private String creator;
   
    @Column
    private Double version;
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
 
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PrePersist //do this before anything -- Callback
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate //do this before anything
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	//POJO - Empty Constructor  (Java Bean -- creates an empty object for the user to fill in and then stored into the database)
	public Language() {
	}
	
		public Language(String name, String creator, Double version) {
			this.name = name;
			this.creator = creator;
			this.version = version;

		}

	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Double getVersion() {
		return version;
	}

	public void setVerison(Double version) {
		this.version = version;
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
}

