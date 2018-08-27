package com.springintegration.onlineshop.service;

import com.springintegration.onlineshop.pojo.App;
import com.springintegration.onlineshop.pojo.DVD;
import com.springintegration.onlineshop.pojo.Magazine;
import com.springintegration.onlineshop.pojo.OrderItem;

public class OrderItemRouter {
	
	public String routeOrder(OrderItem orderItem) {
		String channel = "";
		if(orderItem.getItem() instanceof Magazine) {
			channel = "magazineItemChannel";
		}
		if(orderItem.getItem() instanceof DVD) {
			channel = "dvdItemChannel";
		}
		if(orderItem.getItem() instanceof App) {
			channel = "appItemChannel";
		}
		
		return channel;
	}

}
