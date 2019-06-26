package com.covalense.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class Validator {
	void validate(String s) {
		if (s.length() >= 5) {
			log.info("Name is valid");
		} else {
			log.info("INVALID NAME");
		}
	}
}
