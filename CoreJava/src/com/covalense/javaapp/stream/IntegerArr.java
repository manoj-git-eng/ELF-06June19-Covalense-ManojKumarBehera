package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class IntegerArr {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(4);
		a1.add(3);
		a1.add(2);
		a1.add(5);
		a1.add(6);

		Comparator<Integer> c = (i, j) -> i.compareTo(j);
		Integer minValue = a1.stream().min(c).get();
		log.info("" + minValue);

	}
}
