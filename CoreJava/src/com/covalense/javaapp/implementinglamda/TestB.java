package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class TestB {
	public static void main(String[] args) {
		Runnable x = () -> {
			for (int i = 0; i < 5; i++) {

				log.info("" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(x);
		t1.start();

		Thread t2 = new Thread(x);
		t2.start();
	}

}
