package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro4 {

	public static void main(String[] args) {
		int a = 34;
		int b = 45;
		int c = 21;
		int sum = a + b + c;
		double avg = sum / 3.0;
		log.info(""+avg);
	}

}
