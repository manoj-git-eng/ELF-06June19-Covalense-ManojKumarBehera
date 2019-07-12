package com.covalense.javaapp.assessmentquestions;

import lombok.extern.java.Log;

@Log
public class Dog implements Animal{

	@Override
	public void sound() {
		log.info("Bow bow");
	}

}
