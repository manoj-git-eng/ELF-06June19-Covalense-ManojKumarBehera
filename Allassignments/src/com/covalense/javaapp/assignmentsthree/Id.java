package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Id extends Search {
	@Override
	void search() {
		log.info("Searching by ID");
	}
}
