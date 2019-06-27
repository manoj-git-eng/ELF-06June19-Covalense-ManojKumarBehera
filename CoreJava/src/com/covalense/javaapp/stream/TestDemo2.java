package com.covalense.javaapp.stream;

import lombok.extern.java.Log;
@Log
public class TestDemo2 {
	public static void main(String[] args) {
		Demo a=x->log.info(""+x);
		a.point(10);
	}
}
