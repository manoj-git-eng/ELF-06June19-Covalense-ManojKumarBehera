package com.covalense.javaapp.assignments03;

import lombok.extern.java.Log;

@Log
public class Benz extends Car {
	@Override
	void recieve() {
		log.info("I recieved benz and i am driving it");
	}
}
