package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public abstract class Google {
	void login() {
		log.info("logged");
	}

	abstract void sharedoc();
}
