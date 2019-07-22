package com.covalense.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.extern.java.Log;

@Log
public class Pet {

	private String name;
	@Autowired
	@Qualifier("donkey")
	public Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public static java.util.logging.Logger getLog() {
		return log;
	}
	
	public Animal doSomething() {
		return animal;
		
	}
	
}
