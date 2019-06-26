package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Round1 extends BeforeShoot {
	@Override
	void bullets() {
		log.info("you have shooted 1 bullet");
		log.info("Remaining bullets:5");
	}
}
