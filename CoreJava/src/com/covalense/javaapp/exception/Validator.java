package com.covalense.javaapp.exception;

public class Validator {
	void validate(String s) {
		if (s.length() >= 5) {
			System.out.println("Name is valid");
		} else {
			System.out.println("INVALID NAME");
		}
	}
}
