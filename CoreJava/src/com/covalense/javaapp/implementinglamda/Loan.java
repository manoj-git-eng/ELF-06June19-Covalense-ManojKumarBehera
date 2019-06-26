package com.covalense.javaapp.implementinglamda;

public enum Loan {
 HOME(240),PERSON(241),CAR(242);
 
 private int value;
	private Loan(int value) {
		this.value=value;
	}
	
	public int getvalue() {
		return value;
	}
	
}
