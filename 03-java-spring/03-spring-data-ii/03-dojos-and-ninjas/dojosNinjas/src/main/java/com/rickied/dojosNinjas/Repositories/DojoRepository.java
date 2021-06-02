package com.rickied.dojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rickied.dojosNinjas.Models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
