package com.covalense.javaapp.qspider;

import lombok.extern.java.Log;

@Log
public class TestCard 
{
public static void main(String[] args) {
	Card java=new Card();
	Card angular= new Card();
	
	java.swipe();
	java.swipe();
	angular.swipe();
	log.info("java count is "+ java.count);
	log.info("angular count is "+ angular.count);
	log.info("Organisation count is "+ Card.orgcount);
	
}
}
