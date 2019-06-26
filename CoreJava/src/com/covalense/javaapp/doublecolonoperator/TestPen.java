package com.covalense.javaapp.doublecolonoperator;

public class TestPen {

	public static void main(String[] args) {
		PenFactory pf=Pen::new;
		pf.getPen();
		
	}
}
