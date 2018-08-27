package com.springintegration.onlineshop.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springintegration.onlineshop.pojo.App;
import com.springintegration.onlineshop.pojo.DVD;
import com.springintegration.onlineshop.pojo.Magazine;
import com.springintegration.onlineshop.pojo.Order;
import com.springintegration.onlineshop.pojo.OrderItem;

public class MainEntryPoint {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/META-INF/com/springintegration/onlineshop/si-shop.xml", MainEntryPoint.class);
		
		//inject in shop (gateway)
		Shop shop = (Shop) context.getBean("shop");
		
		final Order order = generateOrder();
		
		shop.placeOrder(order);
		
		context.close();
		
		
	}

	private static Order generateOrder() {
		// TODO Auto-generated method stub
		
		Magazine magazine = new Magazine("Nature", new BigDecimal(100), "AE");
		DVD dvd = new DVD("SI DVD", new BigDecimal(100),"Spring Team");
		App app = new App("Race", new BigDecimal(100), "1.0");
		
		OrderItem magazineItem = new OrderItem(magazine);
		OrderItem dvdItem = new OrderItem(dvd);
		OrderItem appItem = new OrderItem(app);
		
		final List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(magazineItem);
		orderItems.add(dvdItem);
		orderItems.add(appItem);
		
		Order order = new Order();
		order.setOrderItems(orderItems);
		
		return order;
	}
	

}
