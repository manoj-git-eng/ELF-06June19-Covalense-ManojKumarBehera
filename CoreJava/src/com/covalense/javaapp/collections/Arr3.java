package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class Arr3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(8.6);
		a.add('A');
		a.add("Manoj");

		Iterator it = a.iterator();
		while (it.hasNext()) {

			Object obj = it.next();
			log.info(""+obj);
		}

	}
}
