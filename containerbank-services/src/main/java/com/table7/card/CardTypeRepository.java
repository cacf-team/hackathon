package com.table7.card;

import com.table7.model.CardType;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardTypeRepository extends  MongoRepository<CardType, String> {

	CardType findById(Integer id);
	
}
