package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class Arr7 {
	public static void main(String[] args) {
		
		ArrayList<Double> a = new ArrayList<>();
		a.add(12.8);
		a.add(8.6);
		a.add(87.9);
		a.add(34.5);
		Iterator<Double> it = a.iterator();
		while (it.hasNext()) {

			Double d =  it.next();
			log.info(""+d);
		}
}
}
