package com.covalense.javaapp.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vctr1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector();

		v.add(12);
		v.add(34);
		v.add(32);
		v.add(89);
		
		System.out.println("Using for ");
		for (int i = 0; i < v.size(); i++) {
			Integer o = v.get(i);
			System.out.println(o);
		}

		System.out.println("Using forEach ");
		for (Integer c : v) {
			System.out.println(c);
		}
		
		System.out.println("Using Iterator ");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			Integer o = it.next();
			System.out.println(o);
		}
		
		System.out.println("Using ListIterator ");
		ListIterator<Integer> lit = v.listIterator();
		while (lit.hasNext()) {
			Integer o = lit.next();
			System.out.println(o);
		}
		
		System.out.println("Using ListIterator ");
		ListIterator<Integer> lt = v.listIterator(v.size());
		while (lt.hasPrevious()) {
			Integer o = lt.previous();
			System.out.println(o);
		}
		
		
		System.out.println("Using Enumeration ");
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			Integer i = en.nextElement();
			System.out.println(i);
		}

	}
}
