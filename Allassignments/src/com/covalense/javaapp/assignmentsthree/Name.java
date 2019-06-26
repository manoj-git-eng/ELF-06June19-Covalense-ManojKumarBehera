package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Name extends Search {
	@Override
	void search() {
		log.info("Searching by name");
	}
}
