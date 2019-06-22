package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class Person implements Animal, Human {
	public void eat() {
		log.info("Eating");
	}

	public void walk() {
		log.info("Walking");
	}

}
