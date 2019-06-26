package com.covalense.javaapp.lamdaex;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class Test3Predicate {
public static void main(String[] args) {
	int [] i= {2,5,9,6,4,3};
	Predicate<Integer> p=a->a%2!=0;{
		
	}
	for (int j = 0; j < i.length; j++) {
		if(p.test(i[j])) {
			log.info(""+i[j]);
		}
		
	}
}
}
