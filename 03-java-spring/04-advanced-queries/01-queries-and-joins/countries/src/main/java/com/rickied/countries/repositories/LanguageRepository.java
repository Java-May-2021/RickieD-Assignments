package com.rickied.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rickied.countries.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	//Get all the languages
	@Query("SELECT l FROM Language l")
	List<Language> findAllLanguages();
    
    // Get all the country codes of the language
    @Query("SELECT l.country_code From Language l")
    List<Language> findAllLanguageCountryCodes();
    
    // Passing params and filtering (still retrieves a list)
    @Query("SELECT l FROM Language l WHERE id = ?1")
    List<Language> getLanguageWhereId(Long id);
    
    // Passing params and filtering
    @Query("SELECT l FROM Language l WHERE id = ?1")
    Language getSingleLanguageWhereId(Long id);
}
