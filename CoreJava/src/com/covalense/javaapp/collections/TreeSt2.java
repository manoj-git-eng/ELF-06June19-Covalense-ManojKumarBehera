package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TreeSt2 {
	public static void main(String[] args) {

		TreeSet hs = new TreeSet();
		hs.add(12);
		hs.add(3);
		hs.add(35);

		for (Object obj : hs) {
			log.info("" + obj);
		}
		log.info("***********");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			log.info("" + obj);
		}

	}
}
