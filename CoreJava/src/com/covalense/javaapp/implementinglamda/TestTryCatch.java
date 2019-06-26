package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class TestTryCatch {
	public static void main(String[] args) {
		try {
			int a = 10 / 2;
			log.info(""+a);

		} catch (ArithmeticException e) {
			log.info("can not divide with zero");
		} catch (NullPointerException e) {
			log.info("Null point exception");
		}catch (Exception e) {
			log.info("i am general");
		}
	}
}
