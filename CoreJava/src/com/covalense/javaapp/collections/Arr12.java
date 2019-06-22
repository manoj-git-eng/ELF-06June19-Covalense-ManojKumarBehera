package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import lombok.extern.java.Log;
@Log
public class Arr12 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("mario");
		ar.add("sario");
		ar.add("rario");
		ListIterator<String> li = ar.listIterator(ar.size()); //giving the pointing index

		while (li.hasPrevious()) {

			String s = li.previous();
			log.info(s);
		}
	}
}
