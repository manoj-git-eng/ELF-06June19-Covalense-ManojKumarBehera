package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class Arr10 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("mario");
		ar.add("sario");
		ar.add("rario");
		for (String s : ar) {

			log.info(s);
		}
	}
}
