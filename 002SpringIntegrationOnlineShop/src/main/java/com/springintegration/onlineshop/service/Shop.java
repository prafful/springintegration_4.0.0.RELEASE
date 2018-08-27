package com.springintegration.onlineshop.service;

import org.springframework.integration.annotation.Gateway;

import com.springintegration.onlineshop.pojo.Order;

public interface Shop {

	@Gateway(requestChannel="ordersChannel")
	void placeOrder(Order order); 
}

