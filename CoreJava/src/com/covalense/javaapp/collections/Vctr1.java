package com.covalense.javaapp.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class Vctr1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector(); // i am using vector for example.

		v.add(12);
		v.add(34);
		v.add(32);
		v.add(89);

		log.info("Using for ");
		for (int i = 0; i < v.size(); i++) {
			Integer o = v.get(i);
			log.info("" + o);
		}

		log.info("Using forEach ");
		for (Integer c : v) {
			log.info("" + c);
		}

		log.info("Using Iterator ");
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			Integer o = it.next();
			log.info("" + o);
		}

		log.info("Using ListIterator ");
		ListIterator<Integer> lit = v.listIterator();
		while (lit.hasNext()) {
			Integer o = lit.next();
			log.info("" + o);
		}

		log.info("Using ListIterator ");
		ListIterator<Integer> lt = v.listIterator(v.size());
		while (lt.hasPrevious()) {
			Integer o = lt.previous();
			log.info("" + o);
		}

		log.info("Using Enumeration ");
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			Integer i = en.nextElement();
			log.info("" + i);
		}

	}
}
