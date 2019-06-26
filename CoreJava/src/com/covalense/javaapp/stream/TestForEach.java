package com.covalense.javaapp.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class TestForEach {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<>();
	a1.add(5);
	a1.add(4);
	a1.add(3);
	a1.add(2);
	a1.add(9);
	
	a1.stream().forEach(i->log.info(""+i));
}
}
