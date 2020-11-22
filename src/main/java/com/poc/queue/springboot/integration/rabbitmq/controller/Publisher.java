package com.poc.queue.springboot.integration.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.queue.springboot.integration.rabbitmq.entity.SampleMessage;
import com.poc.queue.springboot.integration.rabbitmq.service.SenderService;

@RestController
@RequestMapping("/api/v1")
public class Publisher {
	
	@Autowired
	private SenderService senderService;
	
	@GetMapping("/send")
	public String publish() {
		SampleMessage sampleMsg = new SampleMessage("testing msg");
		senderService.send(sampleMsg);
		return "msg sent...";
	}
}
