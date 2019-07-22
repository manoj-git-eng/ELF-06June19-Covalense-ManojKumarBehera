package com.covalense.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.java.Log;

@Log
public class MessageBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	private void init() {
		log.info("Starting the phase!!!!!");
	}
	@PreDestroy
	private void destroy() {
		log.info("Destroyed the phase!!!!!");
	}

}
