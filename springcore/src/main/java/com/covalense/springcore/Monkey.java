package com.covalense.springcore;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	@Override
	public void eat() {
		log.info("Monkey eating banana");
	}

	@Override
	public void makeSound() {
		log.info("Monkey making sound");
	}

}
