package com.table7.card;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.table7.model.Advisor;



public interface AdvisorRepository extends MongoRepository<Advisor, String> {

}
