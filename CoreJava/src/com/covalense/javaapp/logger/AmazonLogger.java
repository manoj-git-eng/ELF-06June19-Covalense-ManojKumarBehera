package com.covalense.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AmazonLogger {
	public static final Logger log = Logger.getLogger("Amazon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		try {
			FileHandler fh = new FileHandler("Amazon.log", true);
			fh.setLevel(Level.ALL);
			log.addHandler(fh);
			log.log(Level.SEVERE, "HI i am severe");
			log.log(Level.WARNING, "HI i am warning");
			log.log(Level.INFO, "HI i am info");

		} catch (SecurityException | IOException e) {
			log.info("Exception");
		}

	}
}
