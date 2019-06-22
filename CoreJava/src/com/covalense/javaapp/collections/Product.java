package com.covalense.javaapp.collections;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;

	@Override
	public int compareTo(Product o) {
		if (this.rating < o.rating) {
			return -1;
		} else if (this.rating > o.rating) {
			return 1;
		} else {
			return 0;
		}
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
