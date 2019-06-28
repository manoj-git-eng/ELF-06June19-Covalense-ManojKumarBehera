package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class Iphone extends Phone {
	public static final Logger log = Logger.getLogger("man");

	@Override
	void get() {
		log.info("getting Iphone");

	}
}
