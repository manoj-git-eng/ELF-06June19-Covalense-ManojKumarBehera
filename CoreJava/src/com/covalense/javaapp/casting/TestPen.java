package com.covalense.javaapp.casting;

public class TestPen {
	public static void main(String[] args) {
		
		
		Pen p=new Marker();	//Up-casting.
		Marker m=(Marker)p;	//Down-casting.
		m.cost=10;
		m.size=15.5;
		m.write();
		m.color();
		
	}

}
