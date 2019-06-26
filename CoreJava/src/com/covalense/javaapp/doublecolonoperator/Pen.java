package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen() {
		log.info("ZERO Parameter cons");
	}

	void write() {
		log.info("i am write method");
	}
}
