package com.rickied.countries.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class City {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
    private String name;
	
	@Column
    private String country_code;
	
	@Column
    private String district;
	
	@Column
    private int population;
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    
    @JoinColumn(name="country_id")
    
    private Country country;
    
    City(){
    	
    }
    
    public City(String name, String country_code, String district, int population) {
		this.name = name;
		this.country_code = country_code;
		this.district = district;
		this.population = population;
	}
    
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

	public String getCoutry_code() {
		return country_code;
	}

	public void setCoutry_code(String coutry_code) {
		this.country_code = coutry_code;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
    
    
}
