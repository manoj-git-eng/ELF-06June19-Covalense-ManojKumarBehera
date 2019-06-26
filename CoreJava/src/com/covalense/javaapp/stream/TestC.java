package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestC {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(4);
		a1.add(3);
		a1.add(2);
		a1.add(9);

		Comparator<Integer> c = (i, j) -> i.compareTo(j) * -1;
		Stream<Integer> s = a1.stream().sorted(c);
		List<Integer> l = s.collect(Collectors.toList());
		log.info("" + l);

	}
}
