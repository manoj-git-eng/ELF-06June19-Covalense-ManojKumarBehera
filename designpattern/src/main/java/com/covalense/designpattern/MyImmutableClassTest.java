package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {

		MyImmutableClass immutableClass=null;
		
		
		 immutableClass= new MyImmutableClass("Soundu", 23,7381453678l);
		log.info("Name is "+immutableClass.getName());
		log.info("Age is "+immutableClass.getAge());
		log.info("Contact "+immutableClass.getPhone());
		

		 immutableClass= new MyImmutableClass("Bodhuku", 25,9381453678l);
		log.info("Name is "+immutableClass.getName());
		log.info("Age is "+immutableClass.getAge());
		log.info("Contact "+immutableClass.getPhone());
	}
}
