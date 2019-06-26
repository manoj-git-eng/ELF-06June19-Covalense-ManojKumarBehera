package com.covalense.javaapp.lamdaex;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class Test1Function {
	public static void main(String[] args) {
		Function<Double, Double> f = r -> 3.141 * r * r;
		double d = f.apply(9.8);
		log.info("" + d);
	}
}
