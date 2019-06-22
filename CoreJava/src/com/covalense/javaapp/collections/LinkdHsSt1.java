package com.covalense.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkdHsSt1 {
	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("man");
		hs.add("hag");
		hs.add("maq");

		for (String obj : hs) {
			System.out.println(obj);
		}
		System.out.println("***********");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
		}

	}
}
