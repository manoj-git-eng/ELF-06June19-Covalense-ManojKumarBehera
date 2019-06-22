package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro18 {
	static int multiplication(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		int r = multiplication(4, 5);
		log.info("The result is " + r);
	}
}
