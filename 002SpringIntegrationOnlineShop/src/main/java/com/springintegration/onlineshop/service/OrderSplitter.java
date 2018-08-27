package com.springintegration.onlineshop.service;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

import com.springintegration.onlineshop.pojo.Order;


public class OrderSplitter extends  AbstractMessageSplitter{

	@Override
	protected Object splitMessage(Message<?> arg0) {
		// TODO Auto-generated method stub
		return ((Order) arg0.getPayload()).getOrderItems();
	}

}
