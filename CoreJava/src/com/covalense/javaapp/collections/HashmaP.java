package com.covalense.javaapp.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;
@Log
public class HashmaP {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer i = e.getValue();
			
			log.info("Key is "+key);
			log.info("value is "+i);
			log.info("**************");

		}

	}
}
