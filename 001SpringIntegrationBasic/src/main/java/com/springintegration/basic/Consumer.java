package com.springintegration.basic;

import org.springframework.messaging.Message;

public class Consumer {
	
	public void consumeNumber(Message<String> message) {
		System.out.println("Consumed message: " + message.getHeaders() + " # " + message.getPayload());
	}

}
