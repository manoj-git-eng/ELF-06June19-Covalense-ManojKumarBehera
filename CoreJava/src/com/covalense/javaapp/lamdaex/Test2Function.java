package com.covalense.javaapp.lamdaex;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class Test2Function {
	public static void main(String[] args) {
		Function<String, Integer> f = i -> i.length();

		int x = f.apply("ffa badgg");
		log.info("" + x);
	}
}
