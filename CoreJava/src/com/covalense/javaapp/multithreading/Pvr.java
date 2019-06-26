package com.covalense.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Pvr {
synchronized	void book() {
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {

				wait();
			} catch (InterruptedException e) {
				log.info("Interrupted exception");
			}
		}
	}
}
