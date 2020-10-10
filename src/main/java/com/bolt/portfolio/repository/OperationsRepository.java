package com.bolt.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bolt.portfolio.model.Operation;

public interface OperationsRepository extends MongoRepository<Operation, String>{
	
	
}
