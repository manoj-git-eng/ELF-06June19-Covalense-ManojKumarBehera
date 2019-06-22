package com.covalense.javaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	Logger log = Logger.getLogger("Amazon");

	void connectDb() {
		log.info("Connected");
		log.log(Level.SEVERE, "SEVERE");

	}
}
