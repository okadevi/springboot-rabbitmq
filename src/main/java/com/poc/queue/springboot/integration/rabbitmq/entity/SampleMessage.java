package com.poc.queue.springboot.integration.rabbitmq.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleMessage implements Serializable {
	
	private String msg;
	private Long time;
	
	public SampleMessage(@JsonProperty("msg") String msg) {
		this.msg = msg;
		this.time = System.currentTimeMillis();
	}
	public String getMsg() {
		return msg;
	}

	public Long getTime() {
		return time;
	}
		
}
