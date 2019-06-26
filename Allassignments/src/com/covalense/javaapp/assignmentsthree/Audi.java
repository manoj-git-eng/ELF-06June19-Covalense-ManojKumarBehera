package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Audi extends Car {
	@Override
	void recieve() {
		log.info("I recieved audi car and driving it");
	}
}
