package com.covalense.javaapp.stream;

import lombok.extern.java.Log;

@Log
public class TestDemo {
public static void main(String[] args) {
	Pen p=new Pen();
	Demo a=p::write;
	a.point(10);
	
}
}
