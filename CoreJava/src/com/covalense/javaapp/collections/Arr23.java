package com.covalense.javaapp.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Arr23 {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(9.2);
		a.add("Amn");
		a.add(6.9);
		a.add(2);
		a.add('a');

		ListIterator lit = a.listIterator();
		while (lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}

	}
}
