package com.covalense.javaapp.casting;

public class TestChips {
public static void main(String[] args) {
	Chips c1=new Bingo();
	Bingo b=(Bingo)c1;
	
	b.open();
	b.byteBingo();
	
}
}
