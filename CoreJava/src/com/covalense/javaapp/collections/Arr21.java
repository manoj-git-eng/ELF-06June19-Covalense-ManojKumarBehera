package com.covalense.javaapp.collections;


import java.util.LinkedList;

public class Arr21 {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(9.2);
		a.add("Amn");
		a.add(6.9);
		a.add(2);
		a.add('a');

		
		for (Object obj : a) {
			System.out.println(obj);
		}

	}
}
