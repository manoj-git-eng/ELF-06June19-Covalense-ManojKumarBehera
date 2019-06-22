package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class Arr11 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("mario");
		ar.add("sario");
		ar.add("rario");
		Iterator<String> it = ar.iterator();
		while (it.hasNext()) {
			String s = it.next();
			log.info(s);
		}
	}
}
