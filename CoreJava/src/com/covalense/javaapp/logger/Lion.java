package com.covalense.javaapp.logger;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {
	@Override
	void sound() {
		log.info("Lion sound");
	}
}
