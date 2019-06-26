package com.covalense.javaapp.exception;

import lombok.extern.java.Log;

@Log
public class TestKP {
	public static void main(String[] args) {
		log.info("Main method started");
		KRCTC k = new KRCTC();
		PAYTM p = new PAYTM();
		p.upi();
		k.book();
		log.info("Main method ended");

	}
}
