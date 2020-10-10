package com.bolt.portfolio.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Portfolio {
	
	@Id
	public String id;

	String ticker;
	
	String tickerName;
	
	Double currentPrice;

	String stockExchange;
	
	List<Operation> operations;
	


	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	} 	
	
	public String getTickerName() {
		return tickerName;
	}

	public void setTickerName(String tickerName) {
		this.tickerName = tickerName;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	
}
