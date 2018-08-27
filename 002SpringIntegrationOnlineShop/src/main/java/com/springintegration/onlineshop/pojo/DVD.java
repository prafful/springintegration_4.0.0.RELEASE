package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;

public class DVD extends Item{

	private String artist;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public DVD(String title, BigDecimal price, String artist) {
		super(title, price);
		this.artist = artist;
	}
	
	public DVD() {
		super();
		
	}
	
	
	
	
}
