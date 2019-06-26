package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestFunction {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(4);
		a1.add(3);
		a1.add(2);
		a1.add(6);

		List<Integer> x = a1.stream().map(i -> i * 2).collect(Collectors.toList());
		log.info("" + x);

	}
}
