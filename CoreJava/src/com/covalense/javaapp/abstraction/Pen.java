package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Pen {
	void draw() {
		log.info("Drawing");
	}

	abstract void write();

	abstract void color();
}
