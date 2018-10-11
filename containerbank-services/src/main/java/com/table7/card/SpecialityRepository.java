package com.table7.card;

import com.table7.model.Specialty;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface SpecialityRepository extends  MongoRepository<Specialty, String> {

	Specialty findById(Integer id);
	
}
