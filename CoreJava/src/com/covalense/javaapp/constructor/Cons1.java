package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Cons1 {
	Cons1(int a) {
		a=5;
		log.info("" + a);
	}

	Cons1(double d) {
		d=23.67;
		log.info(""+d);
	}

	Cons1() {
		log.info("ZERO");
	}
}
