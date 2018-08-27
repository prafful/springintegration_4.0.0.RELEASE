package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;

public class Magazine extends Item{
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	public Magazine(String title, BigDecimal price, String author) {
		super(title, price);
		this.author = author;
	}

	public Magazine( ) {
		super();
		
	}	
	
	

}
