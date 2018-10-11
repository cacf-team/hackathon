package com.table7.card;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.table7.model.Customer;


public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	

}
