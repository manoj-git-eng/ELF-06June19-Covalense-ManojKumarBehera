package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro19 {
	static int doFactorial(int a) {

		int r = 1;
		for (int i = 1; i <= a; i++) {
			r = r * i;
		}
		return r;
	}

	public static void main(String[] args) {
		int res = doFactorial(5);
		log.info("The factorial is " + res);
	}
}
