package com.covalense.javaapp.assignments03;

import lombok.extern.java.Log;

@Log
public class Round2 extends BeforeShoot {
	@Override
	void bullets() {
		log.info("you have shooted 2 bullet");
		log.info("Remaining bullets:3");
	}

}
