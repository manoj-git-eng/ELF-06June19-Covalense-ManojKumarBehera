package com.covalense.springcore;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
		log.info("Donkey eating Grass");
	}

	@Override
	public void makeSound() {
		log.info("Donkey making Sound");
	}

}
