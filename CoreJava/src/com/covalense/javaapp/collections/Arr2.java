package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class Arr2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(8.6);
		a.add('A');
		a.add("Manoj");

		for (Object obj : a) {
			log.info("" + obj);
		}

	}
}
