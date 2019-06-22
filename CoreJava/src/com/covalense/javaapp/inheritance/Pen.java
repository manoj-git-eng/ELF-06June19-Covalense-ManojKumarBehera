package com.covalense.javaapp.inheritance;

@lombok.extern.java.Log
public class Pen {
	int cost = 50;

	void write() {
		log.info("Writting");
	}

	public void open() {
		log.info("opened");
	}
}
