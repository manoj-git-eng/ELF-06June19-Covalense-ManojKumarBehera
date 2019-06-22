package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		if (a < b) {
			log.info(b + " is greater");
		} else {
			log.info(a + " is greater");
		}
	}

}
