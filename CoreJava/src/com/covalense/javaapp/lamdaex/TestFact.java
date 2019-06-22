package com.covalense.javaapp.lamdaex;

import lombok.extern.java.Log;

@Log
public class TestFact {
	public static void main(String[] args) {
		Fact f = a -> {
			int k = 1;
			for (int i = 1; i <= a; i++) {
				k = k * i;
			}
			return k;
		};
		int r = f.fact(4);
		log.info(""+r);

	}
}
