package com.covalense.javaapp.assignments03;


public class TestDriver {
	public static void main(String[] args) {
		Car c=new Audi();
		Car c1=new Benz();
		Driver d=new Driver();
		d.recieve(c1);
		d.recieve(c);
	}
}
