package com.covalense.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import lombok.extern.java.Log;

import java.util.logging.LogManager;

@Log
public class NewLog {
	private static final Logger loger = Logger.getLogger("Priya");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			FileHandler fh = new FileHandler("logData.log", true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			loger.log(Level.SEVERE, "HI i am severe");
			loger.log(Level.WARNING, "HI i am warning");
			loger.log(Level.INFO, "HI i am info");
			loger.log(Level.CONFIG, "HI i am config");
			loger.log(Level.FINE, "HI i am fine");
			loger.log(Level.FINER, "HI i am finer");
			loger.log(Level.FINEST, "HI i am finest");
			Product p = new Product();
			p.buyProduct();

		} catch (IOException e) {
			log.severe("IO Exception");
		}
		log.info("Done");
	}
}
