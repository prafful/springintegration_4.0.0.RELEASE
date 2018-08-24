package com.springintegration.basic;

public class Producer {
	
	private static Integer number = 0;
	
	public String produceNumber() {
		return (++number).toString();
	}

}
