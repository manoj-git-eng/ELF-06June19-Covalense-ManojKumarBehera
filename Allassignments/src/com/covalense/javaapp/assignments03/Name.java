package com.covalense.javaapp.assignments03;

import lombok.extern.java.Log;

@Log
public class Name extends Search {
	@Override
	void search() {
		log.info("Searching by name");
	}
}
