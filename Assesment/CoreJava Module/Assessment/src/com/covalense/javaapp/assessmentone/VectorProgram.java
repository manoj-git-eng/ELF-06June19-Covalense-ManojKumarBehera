package com.covalense.javaapp.assessmentone;

import java.util.Vector;
import java.util.logging.Logger;

public class VectorProgram extends AllLists {
	public static final Logger log = Logger.getLogger("man");

	void getVector() {
		Vector<Integer> v1 = new Vector<>();
		v1.add(23);
		v1.add(90);
		v1.add(67);

		for (Integer i : v1) {
			log.info("" + i);
		}
	}
}
