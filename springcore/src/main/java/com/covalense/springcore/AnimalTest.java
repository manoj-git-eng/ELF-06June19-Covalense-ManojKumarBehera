package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnimalTest {
	public static void main(String[] args) {

		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet= applicationcontext.getBean(Pet.class);
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
	}
}
