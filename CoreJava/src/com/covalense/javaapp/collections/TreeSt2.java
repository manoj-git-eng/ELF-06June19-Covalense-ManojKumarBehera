package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSt2 {
	public static void main(String[] args) {

		TreeSet hs = new TreeSet();
		hs.add(12);
		hs.add(3);
		hs.add(35);

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
