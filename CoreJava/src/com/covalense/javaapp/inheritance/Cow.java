package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal1 {
	void food() {
		log.info("Grass");
	}

}
