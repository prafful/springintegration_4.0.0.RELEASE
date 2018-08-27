package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;

public class OrderItem {

	private BigDecimal discountedPrice;
	private Item item;
	private int count;
	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public OrderItem(BigDecimal discountedPrice, Item item, int count) {
		super();
		this.discountedPrice = discountedPrice;
		this.item = item;
		this.count = count;
	}
	public OrderItem() {
		super();
		
	}
	
	public BigDecimal getTotalPrice() {
		return item.getPrice().multiply(new BigDecimal(count));
	}
	
	public OrderItem(Item item) {
		this.item = item;
		count = 1;
	}
	
	
	
}
