package com.covalense.javaapp.assignmentsthree;

import lombok.extern.java.Log;

@Log
public class Round3 extends BeforeShoot {
	@Override
	void bullets() {
		log.info("you have shooted 3 bullet");
		log.info("Remaining bullets:0");
		log.info("Load your Gun");
	}

}
