package com.covalense.javaapp.collections;

import java.util.LinkedList;

public class Arr20 {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(9.2);
		a.add("Amn");
		a.add(6.9);
		a.add(2);
		a.add('a');

		for (int i = 0; i < a.size(); i++) {
			Object o = a.get(i);
			System.out.println(o);
		}

	}
}
