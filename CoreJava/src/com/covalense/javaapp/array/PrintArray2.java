package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArray2 {
	public static void main(String[] args) {

		char[] c = new char[2];
		c[0] = 'A';
		c[1] = 'f';
		for (int i = 0; i < c.length; i++) {
			log.info("" + c[i]);

		}
		log.info("length= " + c.length);

	}

}
