package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class PhoneMachine {
	public static final Logger log = Logger.getLogger("man");
	void givePhone(Phone p) {

		if(p instanceof Mi) {
			log.info("getting Mi phone ");
		} else {
			log.info("getting Iphone");
		}
	}
}
