package com.rickied.relationships.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import net.bytebuddy.asm.Advice.This;

@Entity
@Table(name="persons")
public class Person {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column
	    @Size(min=3,max=30, message="First name must include at least three characters")
	    private String firstName;
	    @Column
	    @Size(min=3,max=30, message="Last name must include at least three characters")
	    private String lastName;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
	    private Date createdAt;
	    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
	    private Date updatedAt;
	    
	    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	    
		private License license;
	    
	    public Person() {
	        
	    }
	    
	    public Person(String firstName, String lastName, Date createdAt, Date updatedAt) {
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.createdAt = createdAt;
	    	this.updatedAt = updatedAt;
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
		
		public License getLicense() {
			return license;
		}

		public void setLicense(License license) {
			this.license = license;
		}
	    
}
