package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Honda {
	void design() {
		log.info("Design");
	}

	abstract void run();
}
