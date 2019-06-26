package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(4);
		a1.add(3);
		a1.add(2);
		a1.add(9);

		Stream<Integer> s = a1.stream().sorted();
		List<Integer> l = s.collect(Collectors.toList());
		// List<Integer> s= a1.stream().sorted().collect(Collectors.toList());

		log.info("" + l);
	}
}
