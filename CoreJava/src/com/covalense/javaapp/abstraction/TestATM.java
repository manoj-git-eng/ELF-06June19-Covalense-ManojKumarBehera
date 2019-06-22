package com.covalense.javaapp.abstraction;

public class TestATM {
	public static void main(String[] args) {

		Machine m = new Machine();

		SBI s = new SBI();
		m.slot(s);

	}
}
