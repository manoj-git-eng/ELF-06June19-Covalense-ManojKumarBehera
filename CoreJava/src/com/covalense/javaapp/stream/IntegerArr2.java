package com.covalense.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class IntegerArr2 {
public static void main(String[] args) {
	Integer [] a= {3,7,3,8,2};
	Stream<Integer> s=Stream.of(a);
	s.forEach(i->log.info("value is "+i));
}
}
