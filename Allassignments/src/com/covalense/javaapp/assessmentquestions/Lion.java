package com.covalense.javaapp.assessmentquestions;

import lombok.extern.java.Log;

@Log
public class Lion implements Animal{

	@Override
	public void sound() {
		log.info("Roars");
	}

}
