package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Arr18 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		log.info("Before=====> " + a);
		Boolean res = a.remove(2.4);
		log.info("result is " + res);

		log.info("After=====> " + a);
	}
}
