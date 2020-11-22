package com.poc.queue.springboot.integration.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.poc.queue.springboot.integration.rabbitmq.entity.SampleMessage;

@Service
public class SenderService {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${poc.rabbitmq.exchange}")
	private String exchange;

	@Value("${poc.rabbitmq.routingkey}")
	private String routingKey;
	
	public void send(SampleMessage msg) {
		rabbitTemplate.convertAndSend(exchange, routingKey, msg);
	}
}
