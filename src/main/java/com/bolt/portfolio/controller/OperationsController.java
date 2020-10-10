package com.bolt.portfolio.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bolt.portfolio.model.Operation;
import com.bolt.portfolio.model.OperationSummary;
import com.bolt.portfolio.repository.OperationsRepository;

//Controller the rest API
@RestController
public class OperationsController {
	
	private final OperationsRepository repository;
	private Double newAvgCost;
	
	OperationsController(OperationsRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping("/operation/create")
	public Operation createOperation(@RequestBody Operation operation) {
		return repository.save(operation);
	}
	
	@GetMapping("/operation")
	public List<Operation> findAll() {
		return repository.findAll();
	}
	 
	@GetMapping("/operation/sum")
	public HashMap<String, OperationSummary> summary() {
		
		
		List<Operation> operations = repository.findAll();
		
		HashMap<String, OperationSummary> map = new HashMap<String, OperationSummary>();
		
		
		
		for(int i = 0; i < operations.size(); i++) {
			Operation operation = operations.get(i);
			if (map.containsKey(operation.getTicker())) {
				
				OperationSummary stockSummary = map.get(operation.getTicker());
				double newTotalShares = map.get(operation.getTicker()).getTotalShares() + operation.getShares();				
				double newTotalPrice = map.get(operation.getTicker()).getTotalPrice() + operation.getCostPerShare();
				double newAvgCost = newTotalPrice / newTotalShares; 
	
				stockSummary.setAveragePrice(newAvgCost);
				stockSummary.setTotalShares(newTotalShares);
				stockSummary.setTotalPrice(newTotalPrice);
				
			} else {
				OperationSummary stockSummary = new OperationSummary();
				stockSummary.setAveragePrice(operation.getCostPerShare());
				stockSummary.setTotalShares(operation.getShares());
				stockSummary.setTotalPrice(operation.getCostPerShare());
				map.put(operation.getTicker(), stockSummary);
			}
		
			
		}

		return map;
		
	}
	
	
	
}
