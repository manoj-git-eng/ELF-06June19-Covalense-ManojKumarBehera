package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Girl {
	void recieve(Phone p) {
		if (p instanceof Iphone) {
			log.info("i LOVE YOU");
		} else if (p instanceof Mi) {
			log.info("Thank you bro");
		}

	}

}
