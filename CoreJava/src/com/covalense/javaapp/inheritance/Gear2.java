package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Gear2 extends Car {
	@Override
	void speed() {
		log.info("Speed is 0 to 150");
	}
}
