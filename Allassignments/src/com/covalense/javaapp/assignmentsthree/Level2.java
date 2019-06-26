package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Level2 extends Level {
	@Override
	void status() {
		log.info("fuel status:3liters");
	}
}
