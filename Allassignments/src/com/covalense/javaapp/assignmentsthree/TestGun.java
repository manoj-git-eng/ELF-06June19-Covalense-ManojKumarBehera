package com.covalense.javaapp.assignmentsthree;

public class TestGun {
	public static void main(String[] args) {
		BeforeShoot r2= new Round2();
		

		BeforeShoot r3=new Round3();

		Gun g=new Gun();
		g.count(r2);
		g.count(r3);
		
	}
}
