package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Car2 extends Car1 {
	void horn() {
		log.info("HORN IS BLOWING");

	}
}
