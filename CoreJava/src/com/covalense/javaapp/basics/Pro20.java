package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro20 {
	static int fact(int a) {
		if (a == 0) {
			return 1;
		}
		return a * fact(a - 1);
	}

	public static void main(String[] args) {
		int res = fact(5);
		log.info("The factorial is " + res);
	}
}
