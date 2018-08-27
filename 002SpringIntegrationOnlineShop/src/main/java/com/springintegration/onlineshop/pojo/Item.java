package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;

public class Item {

	protected String title;
	protected BigDecimal price;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Item(String title, BigDecimal price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Item() {
		
	}
	
	
}
