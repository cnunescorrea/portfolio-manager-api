package com.bolt.portfolio.model;

public class OperationSummary {
	
	Double totalShares;
	
	Double averagePrice;
	
	Double totalPrice;
	

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(Double totalShares) {
		this.totalShares = totalShares;
	}

	public Double getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
	}
	

}
