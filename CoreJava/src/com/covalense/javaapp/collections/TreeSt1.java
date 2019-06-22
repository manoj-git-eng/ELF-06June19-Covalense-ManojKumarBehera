package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TreeSt1 {
	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(12);
		hs.add(2);
		hs.add(35);

		for (Integer obj : hs) {
			log.info(""+obj);
		}
		log.info("***********");
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer obj = it.next();
			log.info(""+obj);
		}

	}
}
