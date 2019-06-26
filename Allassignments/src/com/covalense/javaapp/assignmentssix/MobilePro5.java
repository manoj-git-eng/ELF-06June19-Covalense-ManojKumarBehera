package com.covalense.javaapp.assignmentssix;

public class MobilePro5 implements Comparable<MobilePro5> {
	String name;
	double cost;
	String brand;

	void set(String name, double cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public int compareTo(MobilePro5 o) {
		Double a = this.cost;
		Double b = o.cost;
		return a.compareTo(b);
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
