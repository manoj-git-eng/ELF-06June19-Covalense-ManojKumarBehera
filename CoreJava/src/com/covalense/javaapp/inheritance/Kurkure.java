package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Kurkure extends Chips {
	@Override
	void open() {
		log.info("Kurkure opened");
	}

	@Override
	void eat() {
		log.info("Eating Kurkure");
	}
}
