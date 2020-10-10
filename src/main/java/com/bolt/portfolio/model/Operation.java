package com.bolt.portfolio.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Operation {
	
	
	@Id
	public String id;

	String ticker;
	
	String stockExchange;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	Date tradeDate;
	
	Double shares;
	
	Double costPerShare;
	
	String tradeType;

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Double getShares() {
		return shares;
	}

	public void setShares(Double shares) {
		this.shares = shares;
	}

	public Double getCostPerShare() {
		return costPerShare;
	}

	public void setCostPerShare(Double costPerShare) {
		this.costPerShare = costPerShare;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	
	
	
	
	

}
