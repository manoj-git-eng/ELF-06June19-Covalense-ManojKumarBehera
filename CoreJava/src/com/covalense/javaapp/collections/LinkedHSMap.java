package com.covalense.javaapp.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHSMap {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();

		l.put("One", 1);
		l.put("Two", 2);
		l.put("Three", 3);
		l.put("Four", 4);

		for (Map.Entry<String, Integer> e : l.entrySet()) {
			String key = e.getKey();
			Integer i = e.getValue();

			System.out.println("Key is " + key);
			System.out.println("value is " + i);
			System.out.println("**************");

		}

	}

}
