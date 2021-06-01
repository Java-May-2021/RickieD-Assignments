package com.rickied.relationships.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private Double licenseNumber;
    
    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expirationDate;
    
    private String state;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    
    @DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PreUpdate //do this before anything
    protected void onUpdate() {
    	this.updatedAt = new Date();
    }
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    
    public License() {
        
    }
    
//    public String getNumberAsString() {
//		int numZeros = 7 - String.valueOf(this.licenseNumber).length();
//		StringBuilder str = new StringBuilder();
//		for(int i = 0; i < numZeros; i++) {
//			str.append('0');
//		}
//		return String.format("%s%d", str, this.licenseNumber);
//	}
    
    public License(Long id, Double licenseNumber, Date expirationDay, String state) {
    	this.id = id;
    	this.licenseNumber = licenseNumber;
    	this.expirationDate = expirationDay;
    	this.state = state;
    }
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Double getLicNumber() {
    	return licenseNumber;
    }
    
    public void setNumber(Double licenseNumber) {
    	this.licenseNumber = licenseNumber;
    }
    
    public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
    
    public String getState() {
    	return state;
    }
    
    public void setState(String state) {
    	this.state = state;
    }
    
    public Date getCreatedAt() {
    	return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
    	this.createdAt = createdAt;
    }
    
    public Date getUpdatedAt(Date updatedAt) {
    	return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
    	this.updatedAt = updatedAt;
    }
    public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
