package com.bolt.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bolt.portfolio.model.Portfolio;

public interface PortfolioRepository extends MongoRepository<Portfolio, String>{

}
