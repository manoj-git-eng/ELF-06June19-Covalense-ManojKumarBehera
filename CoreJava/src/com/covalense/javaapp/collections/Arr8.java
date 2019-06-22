package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class Arr8 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<>();
		a.add(12.5);
		a.add(8.6);
		a.add(4.56);
		a.add(32.6);

		ListIterator<Double> li = a.listIterator(a.size()); // giving the pointing index

		while (li.hasPrevious()) {

			Double d = li.previous();
			log.info("" + d);
		}
	}
}