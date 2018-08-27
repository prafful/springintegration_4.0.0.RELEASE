package com.springintegration.onlineshop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderId;
	private List<OrderItem> orderItems;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Order(int orderId, List<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.orderItems = orderItems;
	}
	public Order() {
		super();
		
	}
	public BigDecimal getDiscountedCost() {
		// TODO Auto-generated method stub
		BigDecimal total =new BigDecimal(0);
		for(OrderItem oi:orderItems) {
			total = total.add(oi.getDiscountedPrice());
		}
		return total;
	}
	
	public static void main(String args[]) {
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
		System.out.println("Order:" + order);
		System.out.println("Total Price Without Discount: " + order.getTotalCost());
		
	}
	
	public BigDecimal getTotalCost() {
		// TODO Auto-generated method stub
		BigDecimal total =new BigDecimal(0);
		for(OrderItem oi:orderItems) {
			total = total.add(oi.getTotalPrice());
		}
		return total;
	}
	
	
	
	
	

}
