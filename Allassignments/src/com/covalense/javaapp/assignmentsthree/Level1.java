package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Level1 extends Level {
	@Override
	void status() {
		log.info("Tank full");
	}
}
