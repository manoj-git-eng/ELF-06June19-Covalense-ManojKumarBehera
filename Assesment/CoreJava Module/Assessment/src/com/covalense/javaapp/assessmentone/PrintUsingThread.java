package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class PrintUsingThread  {
	public static final Logger log = Logger.getLogger("man");

	void print() {
		for (int i = 1; i <= 10; i++) {
			log.info("" + i);
		}
	}

}
