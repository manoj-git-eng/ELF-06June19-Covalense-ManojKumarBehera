package com.covalense.javaapp.assignmentssix;

import java.util.logging.Logger;

public class Pro7 {

	private static final Logger log = Logger.getLogger("manu");

	public static void main(String[] args) {
		ValidNum v = new ValidNum();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			log.info(" " + e);
		}
	}

}
