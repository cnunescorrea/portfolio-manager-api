package com.bolt.portfolio.model;

import org.springframework.data.annotation.Id;

public class Portfolio {
	
	@Id
	public String id;

	String ticker;
	
	String tickerName;
	
	Double value;
	
	Double amount;
	
	Double avgCost; 
	

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

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getAvgCost() {
		return avgCost;
	}

	public void setAvgCost(Double avgCost) {
		this.avgCost = avgCost;
	}
}
