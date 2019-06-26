package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class TestMath {
	static int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		Mymath m = TestMath::add;
		log.info("" + m.math(22, 78));
	}
}
