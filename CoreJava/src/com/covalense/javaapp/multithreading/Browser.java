package com.covalense.javaapp.multithreading;

public class Browser extends Thread {
	Pvr ref;

	public Browser(Pvr ref) {
		super();
		this.ref = ref;
	}

	@Override
	public void run() {
		ref.book();
	}

}
