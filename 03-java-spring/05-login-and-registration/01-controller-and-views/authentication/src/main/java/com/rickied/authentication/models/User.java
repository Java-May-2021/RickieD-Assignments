package com.rickied.authentication.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	    
	    @Size(min=2, message="Minimum of 2 characters required for First Name")
	    private String firstName;
	    
	    
	    @Size(min=2, message="Minimum of 2 characters required for Last Name")
	    private String lastName;
	    
	    @Email
	    @Size(min=8, message="Email must be at least 8 characters.")
	    private String email;
	    
	    @Size(min=3, message="Password must be at least 3 characters.")
	    private String password;
	    
	    @Transient
	    private String passwordConfirmation;
	    
	    @Column(updatable=false)
	    private Date createdAt;
	    
	    private Date updatedAt;
	    
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


		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
