package com.covalense.javaapp.collections;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.java.Log;

@Log
public class TreeMaP {
	public static void main(String[] args) {

		TreeMap<String, Integer> t = new TreeMap<>();

		t.put("One", 1);
		t.put("Two", 2);
		t.put("Three", 3);
		t.put("Four", 4);

		for (Map.Entry<String, Integer> e : t.entrySet()) {
			String key = e.getKey();
			Integer i = e.getValue();

			log.info("Key is " + key);
			log.info("value is " + i);
			log.info("**************");

		}

	}
}
