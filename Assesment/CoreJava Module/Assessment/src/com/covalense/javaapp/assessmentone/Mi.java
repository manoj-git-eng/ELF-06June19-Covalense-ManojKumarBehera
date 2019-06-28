package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class Mi extends Phone {
	public static final Logger log = Logger.getLogger("man");

	@Override
	void get() {

		log.info("Getting MI");
	}
}
