package com.covalense.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {

	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name + "------>Started");
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		log.info(name + "------>completed");
	}

}
