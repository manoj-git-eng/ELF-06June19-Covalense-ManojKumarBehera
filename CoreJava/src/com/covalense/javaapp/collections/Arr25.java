package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class Arr25 {
	public static void main(String[] args) {
		LinkedList<Character> a = new LinkedList<>();
		a.add('A');
		a.add('b');
		a.add('g');
		a.add('f');
		a.add('w');

		log.info("Using for ");
		for (int i = 0; i < a.size(); i++) {
			Character o = a.get(i);
			log.info("" + o);
		}

		log.info("Using forEach ");
		for (Character c : a) {
			log.info("" + c);
		}
		log.info("Using Iterator ");
		Iterator<Character> it = a.iterator();
		while (it.hasNext()) {
			Character o = it.next();
			log.info("" + o);
		}
		log.info("Using ListIterator ");
		ListIterator<Character> lit = a.listIterator();
		while (lit.hasNext()) {
			Character o = lit.next();
			log.info("" + o);
		}

		log.info("Using ListIterator ");
		ListIterator<Character> lt = a.listIterator(a.size());
		while (lt.hasPrevious()) {
			Character o = lt.previous();
			log.info("" + o);
		}

	}
}
