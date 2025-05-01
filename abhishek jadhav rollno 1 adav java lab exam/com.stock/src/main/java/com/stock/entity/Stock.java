package com.stock.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Generated("\stock")
public class Stock {
	@Id
	@Column
private int  stockId;
	@Column(name="Name",length=40)
private String companyName;
	@Column(name="Price",length=40)
private int currentPrice;
	@Column(name="Quantity",length=40)
private int quantity;
	@Column(name="Date",length=40)
private String tradeDate;

public Stock() {
	// TODO Auto-generated constructor stub
}

public Stock(int stockId, String companyName, int currentPrice, int quantity, String tradeDate) {
	super();
	this.stockId = stockId;
	this.companyName = companyName;
	this.currentPrice = currentPrice;
	this.quantity = quantity;
	this.tradeDate = tradeDate;
}

public int getStockId() {
	return stockId;
}

public void setStockId(int stockId) {
	this.stockId = stockId;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public int getCurrentPrice() {
	return currentPrice;
}

public void setCurrentPrice(int currentPrice) {
	this.currentPrice = currentPrice;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getTradeDate() {
	return tradeDate;
}

public void setTradeDate(String tradeDate) {
	this.tradeDate = tradeDate;
}

@Override
public String toString() {
	return "Stock [stockId=" + stockId + ", companyName=" + companyName + ", currentPrice=" + currentPrice
			+ ", quantity=" + quantity + ", tradeDate=" + tradeDate + "]";
}

}
