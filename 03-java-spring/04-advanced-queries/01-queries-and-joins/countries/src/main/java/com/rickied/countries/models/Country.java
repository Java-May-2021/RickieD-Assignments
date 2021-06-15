package com.rickied.countries.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
    private String code;
    
	@Column
    private String name;
    
	@Column
    private String continent;
	
	@Column
    private String region;
	
	@Column
    private double surface_area;
	
	@Column
    private Integer indep_year;
	
	@Column
    private int population;
	
	@Column
    private Double life_expectancy;
	
	@Column
    private double gnp;
	
	@Column
    private Double gnp_old;
	
	@Column
    private String local_name;
	
	@Column
    private String government_form;
	
	@Column
    private String head_of_state;
	
	@Column
    private Integer capital;
	
	@Column
    private String code2;
    
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	
	private List<Language> languages;
	
    @OneToMany(mappedBy="country",fetch=FetchType.LAZY)
   
    private List<City> cities;
    
    Country() {
    	
    }
    
    public Country(String code, String name, String continent, String region, Float surface_area, Integer indep_year, 
			Integer population, Double life_expectancy, Float gnp, Double gnp_old, String local_name, String government_form,
			String head_of_state, Integer capital, String code2) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surface_area = surface_area;
		this.indep_year = indep_year;
		this.population = population;
		this.life_expectancy = life_expectancy;
		this.gnp = gnp;
		this.gnp_old = gnp_old;
		this.local_name = local_name;
		this.government_form = government_form;
		this.head_of_state = head_of_state;
		this.capital = capital;
		this.code2 = code2;
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getSurface_area() {
		return surface_area;
	}
	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}
	public Integer getIndep_year() {
		return indep_year;
	}
	public void setIndep_year(Integer indep_year) {
		this.indep_year = indep_year;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public Double getLife_expectancy() {
		return life_expectancy;
	}
	public void setLife_expectancy(Double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}
	public double getGnp() {
		return gnp;
	}
	public void setGnp(double gnp) {
		this.gnp = gnp;
	}
	public Double getGnp_old() {
		return gnp_old;
	}
	public void setGnp_old(Double gnp_old) {
		this.gnp_old = gnp_old;
	}
	public String getLocal_name() {
		return local_name;
	}
	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	public String getGovernment_form() {
		return government_form;
	}
	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}
	public String getHead_of_state() {
		return head_of_state;
	}
	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}
	public Integer getCapital() {
		return capital;
	}
	public void setCapital(Integer capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	public List<City> getCity() {
		return cities;
	}
	public void setCity(List<City> cities) {
		this.cities = cities;
	}
     
}
