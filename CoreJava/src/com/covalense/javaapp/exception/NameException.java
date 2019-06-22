package com.covalense.javaapp.exception;

public class NameException extends RuntimeException {
	private final String message;

	public NameException(String messege) {

		this.message = messege;
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
