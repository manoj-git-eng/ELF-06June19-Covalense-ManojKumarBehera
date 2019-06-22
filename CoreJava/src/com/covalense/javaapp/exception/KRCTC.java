package com.covalense.javaapp.exception;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class KRCTC {
	void book() {
		log.info("Booking started");
		File f = new File("manoj.txt");

		try {
			f.createNewFile();
		} catch (IOException e) {
			log.info("Sorry");
		}

		log.info("Booking ended");
	}
}
