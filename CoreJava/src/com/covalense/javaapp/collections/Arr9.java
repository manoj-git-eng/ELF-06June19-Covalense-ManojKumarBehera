package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Arr9 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("mario");
		ar.add("sario");
		ar.add("rario");
		for (int i = 0; i < ar.size(); i++) {
			String s = ar.get(i);
			log.info(s);
		}
	}
}
