package com.covalense.javaapp.casting;

public class TestBus {
	public static void main(String[] args) {
		
		Bus b=new Van();	//Up-casting.
		Van v=(Van)b;		//down-casting.
		
		v.model=5;
		v.seats=40;
		v.move();
		v.turn();
	} 
	

}
