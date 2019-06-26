package com.covalense.javaapp.assignments03;

import lombok.extern.java.Log;

@Log
public class Audi extends Car {
	@Override
	void recieve() {
		log.info("I recieved audi car and driving it");
	}
}
