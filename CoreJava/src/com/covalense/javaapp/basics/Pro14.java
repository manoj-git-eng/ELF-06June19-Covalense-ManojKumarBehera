package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro14 {

	public static void main(String[] args) {
		int a = 12;
		int b = 14;
		int c = 17;

		if (a > b && a > c) {
			log.info(a + " is greater");
		} else if (b > c) {
			log.info(b + " is greater");
		} else {
			log.info(c + " is greater");
		}
	}

}
