package com.springintegration.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("/META-INF/spring/si-component-adapter.xml");
	}

}
