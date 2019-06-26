package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class TestOpen {
	static void open() {
		log.info("opened");
	}

	public static void main(String[] args) {
		TestRoom t = TestOpen::open;
		t.remove();
	}
}
