package com.covalense.javaapp.relations;

import lombok.extern.java.Log;

@Log
public class Person {
	Mobile m = new Mobile();
	int a = 5;

	void walk() {
		log.info("" + a);
	}

}
