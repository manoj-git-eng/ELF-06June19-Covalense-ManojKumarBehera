package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro14 {

	public static void main(String[] args) {
		String s = "is greater";
		int a = 12;
		int b = 14;
		int c = 17;

		if (a > b && a > c) {
			log.info(a + s);
		} else if (b > c) {
			log.info(b + s);
		} else {
			log.info(c + s);
		}
	}

}
