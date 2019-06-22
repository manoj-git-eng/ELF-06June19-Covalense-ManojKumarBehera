package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkdHsSt2 {
	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet<String>();
		hs.add(12);
		hs.add(23.4);
		hs.add("maq");

		for (Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("***********");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}
}
