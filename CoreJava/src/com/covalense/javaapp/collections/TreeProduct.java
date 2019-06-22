package com.covalense.javaapp.collections;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TreeProduct {
	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<>();

		Product p1 = new Product();
		p1.name = "Lays";
		p1.cost = 10;
		p1.rating = 89.8;

		Product p2 = new Product();
		p2.name = "kukure";
		p2.cost = 12;
		p2.rating = 19.8;

		Product p3 = new Product();
		p3.name = "bingo";
		p3.cost = 16;
		p3.rating = 39.8;

		Product p4 = new Product();
		p4.name = "New p";
		p4.cost = 15;
		p4.rating = 49.8;

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Product p : t) {
			log.info("Name is " + p.name);
			log.info("Cost is " + p.cost);
			log.info("Rating is " + p.rating);
		}

	}

}
