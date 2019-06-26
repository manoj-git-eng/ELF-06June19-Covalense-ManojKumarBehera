package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkdHsSt1 {
	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet();
		hs.add("man");
		hs.add("hag");
		hs.add("maq");

		for (String obj : hs) {
			log.info("" + obj);
		}
		log.info("***********");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			log.info("" + obj);
		}

	}
}
