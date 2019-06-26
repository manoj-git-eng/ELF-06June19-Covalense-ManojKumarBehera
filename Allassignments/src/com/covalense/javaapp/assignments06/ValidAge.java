package com.covalense.javaapp.assignments06;

import java.util.logging.Logger;

public class ValidAge {
	private static final Logger log = Logger.getLogger("manu");

	int s;

	void valid(int s) {
		this.s = s;
		if (s > 18) {
			log.info("valid age");
		} else {
			throw new NotValidAge();
		}
	}

}
