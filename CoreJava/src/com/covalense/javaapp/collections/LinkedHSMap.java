package com.covalense.javaapp.collections;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class LinkedHSMap {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();

		l.put("One", 1);
		l.put("Two", 2);
		l.put("Three", 3);
		l.put("Four", 4);

		for (Map.Entry<String, Integer> e : l.entrySet()) {
			String key = e.getKey();
			Integer i = e.getValue();

			log.info("Key is " + key);
			log.info("value is " + i);
			log.info("**************");

		}

	}

}
