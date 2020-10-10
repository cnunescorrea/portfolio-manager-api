package com.bolt.portfolio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bolt.portfolio.model.Portfolio;
import com.bolt.portfolio.repository.PortfolioRepository;

@RestController // exposes http server operations
public class PortfolioController {

	private final PortfolioRepository repository;

	PortfolioController(PortfolioRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/portfolios/status")
	public String greeting() {
		return "Running";
	}

	@PostMapping("/portfolios/create")
	public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
		return repository.save(portfolio);
	}
	
	@GetMapping("/portfolio")
	public List<Portfolio> all() {
		return repository.findAll();
	}
	
	@GetMapping("/portfolio/{id}")
	public Optional<Portfolio> getPortfolio (@PathVariable String id)  {
		return repository.findById(id);
	}
	
	
	@DeleteMapping("/portfolio/{id}")
	void deletePotfolio(@PathVariable String id) {
		repository.deleteById(id);
	}
	
	
}
