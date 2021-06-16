package com.rickied.countries.countryServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.countries.models.City;
import com.rickied.countries.models.Country;
import com.rickied.countries.repositories.CityRepository;
import com.rickied.countries.repositories.CountryRepository;
import com.rickied.countries.repositories.LanguageRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository coRepo;
	
	@Autowired
	CityRepository cRepo;
	
	@Autowired
	LanguageRepository lRepo;
	
//	public CountryService(CountryRepository coRepo, LanguageRepository lRepo, CityRepository cRepo) {
//		this.coRepo = coRepo;
//		this.lRepo = lRepo;
//		this.cRepo = cRepo;
//	}
	
	public List<Object[]> findCountriesSpeakingSlovene() {
		System.out.println(coRepo.findCountriesSpeakingSlovene());
		return coRepo.findCountriesSpeakingSlovene();
	}
	
	public List<Object[]> findCitiesCountByCountry() {
		return coRepo.findCitiesCountByCountry();
	}
	
	public List<Object[]> findLargeLanguagePercentageByCountry() {
		return coRepo.findLargeLanguagePercentageByCountry();
	}
	
	public List<Country> findSmallCountries() {
		return coRepo.findSmallCountries();
	}
	
	public List<Country> findConstMonarchyCountries() {
		return coRepo.findConstMonarchyCountries();
	}
	
	public List<Object[]> findCountriesByRegion() {
		return coRepo.findCountriesByRegion();
	}
	
	public List<City> findMexicanCities() {
		return cRepo.findMexicanCities();
	}
	
	public List<City> findBuenosAiresCities() {
		return cRepo.findBuenosAiresCities();
	}
	
}
