package com.covalense.javaapp.assignments05;

import java.util.logging.Logger;

/*
 * WAP to addd num using lamda expression 
 */
public class Pro1 {
	private static final Logger log = Logger.getLogger("manu");

	static Pro1int s = (a, b) -> a + b;

	public static void main(String[] args) {
		int i = s.add(5, 10);
		log.info("addtion= " + i);

	}

}
