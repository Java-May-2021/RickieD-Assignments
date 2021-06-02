package com.rickied.dojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rickied.dojosNinjas.Models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
