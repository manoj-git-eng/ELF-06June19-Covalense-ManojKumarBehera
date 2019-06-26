package com.covalense.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		log.info("i am running marker");
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.info("InterruptedException");
			}
		}
	}

}
