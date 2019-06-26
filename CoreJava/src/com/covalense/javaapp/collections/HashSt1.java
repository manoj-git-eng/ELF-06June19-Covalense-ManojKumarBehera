package com.covalense.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class HashSt1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("man");
		hs.add(12);
		hs.add(23.87);

		for (Object obj : hs) {
			log.info(""+obj);
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			log.info(""+obj);
		}

	}

}
