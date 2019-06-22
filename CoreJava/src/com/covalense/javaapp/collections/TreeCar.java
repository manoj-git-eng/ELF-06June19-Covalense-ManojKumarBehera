package com.covalense.javaapp.collections;

import java.util.TreeSet;

public class TreeCar {

	public static void main(String[] args) {
		TreeSet<Car> t = new TreeSet();
		
		
		Car c1=new Car();
		c1.name="Honda Accord";
		c1.brand="HONDA";
		c1.cost=2300000;
		c1.rating=67.86;
		
		Car c2=new Car();
		c2.name="Ford Mustang";
		c2.brand="FORD";
		c2.cost=3300000;
		c2.rating=87.86;
		
		Car c3=new Car();
		c3.name="Innova";
		c3.brand="SUZKI";
		c3.cost=1200000;
		c3.rating=67.86;
		
		Car c4=new Car();
		c4.name="BMW 456";
		c4.brand="BMW";
		c4.cost=5300000;
		c4.rating=67.86;
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		for (Car c : t) {
			System.out.println("Name is "+c.name);
			System.out.println("Brand is "+c.brand);
			System.out.println("Cost is "+c.cost);
			System.out.println("Rating is "+c.rating);
			System.out.println("************");
		}
		
		
	}

}
