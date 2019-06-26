package com.covalense.javaapp.methodoverloading;

import lombok.extern.java.Log;

@Log
public class Train {
	void search(String s) {
		log.info("Searching by name");
		log.info(s);
	}

	void search(int n) {
		log.info("Searching by number");
		log.info(""+n);
	}

	void search(String s, int n) {
		log.info("Searching by name & number");
		log.info(s);
		log.info(""+n);
	}
}
