package com.covalense.javaapp.collections;

public class Car implements Comparable<Car> {
	String name;
	String brand;
	int cost;
	double rating;

	@Override
	public int compareTo(Car o) {
		String a = this.name;
		return a.compareTo(o.name);

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", brand=" + brand + ", cost=" + cost + ", rating=" + rating + "]";
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