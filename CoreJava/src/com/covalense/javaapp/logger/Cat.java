package com.covalense.javaapp.logger;

import lombok.extern.java.Log;

@Log
public class Cat extends Animal {
	@Override
	void sound() {
		log.info("Cat sound");
	}
}
