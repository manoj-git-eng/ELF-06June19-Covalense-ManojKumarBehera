package com.covalense.javaapp.encapsulation;

import lombok.extern.java.Log;

@Log
public class DB1 {
	void recieve(Person p) {

		log.info("Name is " + p.getName());
		log.info("Age is " + p.getAge());
		log.info("Gender is " + p.getGender());
		log.info("***********************");

	}
}
