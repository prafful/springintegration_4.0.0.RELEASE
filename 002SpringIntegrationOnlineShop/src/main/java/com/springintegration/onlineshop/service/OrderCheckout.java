package com.springintegration.onlineshop.service;

import java.util.List;

import com.springintegration.onlineshop.pojo.Order;
import com.springintegration.onlineshop.pojo.OrderItem;

public class OrderCheckout {
	
	public Order prepareCheckOut(List<OrderItem> orderItems) {
		
		final Order order = new Order();
		order.setOrderItems(orderItems);
		
		System.out.println("Order Completed");
		System.out.println("Discounted Price: " + order.getDiscountedCost());
		
		return order;
		
	}
	

}
