package com.covalense.javaapp.lamdaex;

import java.util.function.Predicate;

public class Test1Predicate {
public static void main(String[] args) {
	Predicate<Integer> p=a -> a%2==0;
	boolean x=p.test(15);
}
}
