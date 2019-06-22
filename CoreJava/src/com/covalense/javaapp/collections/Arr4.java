package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arr4 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(8.6);
		a.add('A');
		a.add("Manoj");

		ListIterator li = a.listIterator(a.size()); //giving the pointing index

		while (li.hasPrevious()) {

			Object obj = li.previous();
			System.out.println(obj);
		}

	}
}
