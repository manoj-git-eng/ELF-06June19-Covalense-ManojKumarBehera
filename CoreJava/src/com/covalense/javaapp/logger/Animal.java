package com.covalense.javaapp.logger;

import lombok.extern.java.Log;

@Log
public class Animal {

	void sound() {	//This method is going to be overridden in child class.

	}

	void division(int a, int b) {
		try {
			int r = a / b;
			log.info("" + r);
		} catch (ArithmeticException e) {
			log.info("can not divide with zero");
		}
	}
}
