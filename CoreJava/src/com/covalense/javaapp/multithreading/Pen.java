package com.covalense.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			log.info("thread");
			try {
				log.info(""+i);
				sleep(2000);
			} catch (InterruptedException e) {
				log.info("Interrupted exception");
			}
		}

	}

}
