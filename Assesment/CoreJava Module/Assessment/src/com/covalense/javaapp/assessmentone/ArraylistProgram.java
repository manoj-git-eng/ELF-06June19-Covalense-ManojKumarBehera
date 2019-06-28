package com.covalense.javaapp.assessmentone;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArraylistProgram extends AllLists {
	public static final Logger log = Logger.getLogger("man");

	void getArray() {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		a1.add(5);
		a1.add(8);
		a1.add(6);

		for (Integer i : a1) {
			log.info("" + i);
		}
	}
}