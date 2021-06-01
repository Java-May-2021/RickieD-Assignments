package com.rickied.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rickied.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License,Long> {
	List<License> findAll();
//	public License findTopByOrderByNumberDesc();
}
