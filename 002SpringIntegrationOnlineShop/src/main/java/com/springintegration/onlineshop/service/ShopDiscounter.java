package com.springintegration.onlineshop.service;

import java.math.BigDecimal;

import com.springintegration.onlineshop.pojo.OrderItem;

public class ShopDiscounter {
	
	private static final BigDecimal MAGAZINE_DISCOUNT = new BigDecimal(0.05);
	private static final BigDecimal DVD_DISCOUNT = new BigDecimal(0.10);
	private static final BigDecimal APP_DISCOUNT = new BigDecimal(0.15);
	
	//perform discount on the magazine
	public OrderItem discountMagazine(OrderItem orderItem) {
		
		final BigDecimal discountedPrice = orderItem.getTotalPrice().multiply(MAGAZINE_DISCOUNT);
		final BigDecimal finalPrice = orderItem.getTotalPrice().subtract(discountedPrice);
		orderItem.setDiscountedPrice(finalPrice);
		
		return orderItem;
		
		
	}

	public OrderItem discountDvd(OrderItem orderItem) {
		
		final BigDecimal discountedPrice = orderItem.getTotalPrice().multiply(DVD_DISCOUNT);
		final BigDecimal finalPrice = orderItem.getTotalPrice().subtract(discountedPrice);
		orderItem.setDiscountedPrice(finalPrice);
		
		return orderItem;
		
		
	}
	
	public OrderItem discountApp(OrderItem orderItem) {
		
		final BigDecimal discountedPrice = orderItem.getTotalPrice().multiply(APP_DISCOUNT);
		final BigDecimal finalPrice = orderItem.getTotalPrice().subtract(discountedPrice);
		orderItem.setDiscountedPrice(finalPrice);
		
		return orderItem;
		
		
	}
}
