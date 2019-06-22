package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Arr6 {

	public static void main(String[] args) {

		ArrayList<Double> a = new ArrayList<>();
		a.add(12.8);
		a.add(8.6);
		a.add(87.9);
		a.add(34.5);
		for (int i = 0; i < a.size(); i++) {
			Double d = a.get(i);
			log.info(""+d);
			
		}
	}
}
