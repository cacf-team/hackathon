package com.table7.card;

import com.table7.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardRepository extends  MongoRepository<Card, String> {

	Card findById(Integer id);
	
}
