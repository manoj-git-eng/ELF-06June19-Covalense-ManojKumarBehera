package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class LoanMain {
	public static void main(String[] args) {
		Loan l = Loan.CAR;
		int constvalue = l.getvalue();
		log.info("value of home loan is " + constvalue);
	}
}
