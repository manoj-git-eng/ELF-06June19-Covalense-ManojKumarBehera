package com.covalense.javaapp.collections;

import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class Arr24 {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(9.2);
		a.add("Amn");
		a.add(6.9);
		a.add(2);
		a.add('a');
		ListIterator lit = a.listIterator(a.size());
		while (lit.hasPrevious()) {
			Object o = lit.previous();
			log.info("" + o);
		}

	}
}
