package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Animal {
	void eat() {
		log.info("Eating");
	}

	void run() {
		log.info("Running");
	}
}
