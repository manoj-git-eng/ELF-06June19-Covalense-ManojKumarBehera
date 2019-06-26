package com.covalense.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class TestPen {
	public static void main(String[] args) {
		log.info("Main statred");
		Pen p1 = new Pen();

		p1.run();
		Pen p2 = new Pen();
		
		p2.run();

		log.info("Main ended");
	}
}
