package com.covalense.javaapp.exception;

import lombok.extern.java.Log;

@Log

public class PAYTM {
	void upi() throws ArithmeticException {
		log.info("UPI got Authorized");

		try {
			log.info("" + 10 / 0);

		} catch (ArithmeticException e) {
			log.info("Dont divide with zero");
		}

		log.info("Transaction Succesful");
	}
}
