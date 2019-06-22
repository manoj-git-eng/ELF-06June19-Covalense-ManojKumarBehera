package com.covalense.javaapp.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHsMap2 {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();

		l.put("One", 1);
		l.put("Two", 2);
		l.put("Three", 3);
		l.put("Four", 4);

		System.out.println("Onle Keys-----------");
		Set<String> st = l.keySet();

		for (String str : st) {

			System.out.println(str);
		}

		System.out.println("Only values----------");

		Collection<Integer> c = l.values();
		Iterator<Integer> itr = c.iterator();
		while (itr.hasNext()) {
			Integer r = itr.next();
			System.out.println(r);
		}

	}

}
