package com.table7.card;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.table7.model.payment;

public interface PaymentRepository extends MongoRepository<payment, String> {

}
