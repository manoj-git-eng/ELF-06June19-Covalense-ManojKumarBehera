package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	int a;

	void run() {
		log.info("running");
	}
}
