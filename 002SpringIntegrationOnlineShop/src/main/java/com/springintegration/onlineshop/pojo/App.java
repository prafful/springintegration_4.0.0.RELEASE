package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;

public class App extends Item{
	
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public App(String title, BigDecimal price, String version) {
		super(title, price);
		this.version = version;
	}
	
	public App() {
		super();
		
	}
	
	

}
