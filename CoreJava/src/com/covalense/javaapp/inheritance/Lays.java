package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Lays extends Chips {
	@Override
	void open() {
		log.info("Lays opened");
	}

	@Override
	void eat() {
		log.info("Eating Lays");
	}
}
