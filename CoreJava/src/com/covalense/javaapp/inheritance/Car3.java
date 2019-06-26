package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Car3 extends Car2 {
	void light() {
		log.info("Light is glowing");
	}
}
