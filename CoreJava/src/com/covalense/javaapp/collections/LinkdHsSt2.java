package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkdHsSt2 {
	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();
		hs.add(12);
		hs.add(23.4);
		hs.add("maq");

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
