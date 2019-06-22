package com.covalense.javaapp.exception;

public class TestKP {
	public static void main(String[] args)	 {
		System.out.println("Main method started");
		KRCTC k = new KRCTC();
		PAYTM p = new PAYTM();
		p.upi();
		k.book();
		System.out.println("Main method ended");

	}
}
