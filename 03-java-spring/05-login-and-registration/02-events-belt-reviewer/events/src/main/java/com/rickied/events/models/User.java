package com.rickied.events.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=5, message="Minimum of 5 characters required for First Name")
    private String firstName;
    
    
    @Size(min=5, message="Minimum of 5 characters required for Last Name")
    private String lastName;
    
    @NotBlank
    private String location;
    
    @NotBlank
    private String state;
    
    @Email(message="Email must be valid.")
    private String email;
    
    @Size(min=5, message="Password must be at least 5 characters.")
    private String password;
    
    @Transient
    private String passwordConfirmation;
    
    @OneToMany(mappedBy="host", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Event> events;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable( name="joinevents",
    			joinColumns=@JoinColumn(name="user_id"),
    			inverseJoinColumns=@JoinColumn(name="eventz_id")
    			)
    private List<Event> joinedEvents;
    
    @OneToMany(mappedBy="author", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Message> messages;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-DD HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-DD HH:mm:ss")
    private Date updatedAt;
    
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public User() {
    	
    }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Event> getJoinedEvents() {
		return joinedEvents;
	}
	public void setJoinedEvents(List<Event> joinEvents) {
		this.joinedEvents = joinEvents;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	
}
