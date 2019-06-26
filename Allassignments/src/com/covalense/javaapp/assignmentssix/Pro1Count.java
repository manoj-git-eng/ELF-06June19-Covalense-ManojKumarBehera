package com.covalense.javaapp.assignmentssix;

import lombok.extern.java.Log;

@Log
public class Pro1Count {

	static int count;

	public Pro1Count() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}
}
