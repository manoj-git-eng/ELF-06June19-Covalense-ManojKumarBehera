package com.covalense.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class HashSt2 {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("man");
		hs.add("hag");
		hs.add("maq");

		for (String obj : hs) {
			log.info(obj);
		}
		log.info("***********");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			log.info(obj);
		}

	}
}
