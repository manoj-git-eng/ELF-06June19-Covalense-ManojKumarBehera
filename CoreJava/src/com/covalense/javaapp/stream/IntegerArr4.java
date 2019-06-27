package com.covalense.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class IntegerArr4 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(3, 7, 3, 8, 2);
		s.forEach(i -> log.info("values are " + i));
	}
}
