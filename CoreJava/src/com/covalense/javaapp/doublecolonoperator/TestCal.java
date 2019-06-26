package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class TestCal {
public static void main(String[] args) {
	MyStudent my=new MyStudent();
	Average a=my::calculateAvg;
	a.avg(12, 34, 45);
	
}
}
