package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro17 {
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int r = add(5, 4);
		log.info("The result is " + r);
	}

}
