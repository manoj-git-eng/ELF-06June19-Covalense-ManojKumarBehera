package com.covalense.javaapp.multithreading;

public class TestD {
public static void main(String[] args) {
	Marker m=new Marker();
	Thread t1=new Thread();
	t1.start();
	
	Thread t2=new Thread();
	t2.start();

}
}
