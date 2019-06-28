package com.covalense.javaapp.assessmentone;

import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedlistProgram extends AllLists {
	public static final Logger log = Logger.getLogger("man");

	void getLinked() {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(42);
		l1.add(56);
		l1.add(68);
		l1.add(46);

		for (Integer i : l1) {
			log.info("" + i);
		}

	}
}
