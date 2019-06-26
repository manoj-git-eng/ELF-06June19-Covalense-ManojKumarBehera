package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class SciCal extends Cal {

	void sin() {
		log.info("SIN");
	}

	void cos() {
		log.info("COS");
	}
}
