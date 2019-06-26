package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Level3 extends Level {
	@Override
	void status() {
		log.info("fuel status:low...fill the tank as soon as possible");
	}
}
