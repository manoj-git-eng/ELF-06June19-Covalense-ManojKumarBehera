package com.covalense.javaapp.methodoverloading;

import lombok.extern.java.Log;

@Log
public class Animal 
{
	void eat()
	{
		log.info("Eating");
	}
}
@Log
class Cow extends Animal
{
	@Override
	void eat()
	{
		log.info("cow is eating");
	}
}
@Log
class Lion extends Animal
{
	@Override
	void eat() {
		log.info("Lion is eating");
	}
}