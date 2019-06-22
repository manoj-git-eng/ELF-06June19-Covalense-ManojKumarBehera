package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro11 {

	public static void main(String[] args) {
		int a = 11;
		if (a % 2 == 0) {
			log.info("The number " + a + " is Even");
		} else {
			log.info("The number " + a + " is Odd");
		}
	}

}
