package com.covalense.javaapp.casting;

public class TestA {
public static void main(String[] args) {
	
	Animal a=new Cow();
	Cow c=(Cow)a;
	c.i=5;
	c.a=12;
	c.eat();
	c.run();
	
	
}
}
