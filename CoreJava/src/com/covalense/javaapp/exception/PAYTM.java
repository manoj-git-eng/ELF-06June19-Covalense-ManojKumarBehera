package com.covalense.javaapp.exception;

public class PAYTM {
	void upi() throws ArithmeticException{
		System.out.println("UPI got Authorized");
		//try {
			System.out.println(10 / 0);
		/*
		 * }catch(ArithmeticException e) { System.out.println("Dont divide with zero");
		 * }
		 */


		System.out.println("Transaction Succesful");
	}
}
