package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Pencil extends Pen {

	void write() {
		log.info("Writting");
	}

	abstract void color();

}
