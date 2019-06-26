package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class TestBoy {
	public static void main(String[] args) {
		MyBoy1 m = Boy::new;
		Boy b = m.getBoy("man", 12, 23.4);
		log.info("Name is " + b.name);
		log.info("Age is " + b.age);
		log.info("Height is " + b.height);
	}
}
