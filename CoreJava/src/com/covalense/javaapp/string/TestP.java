package com.covalense.javaapp.string;

public class TestP
{
public static void main(String[] args) {
	Person p=new Person("Man", 24, 23000.77);
	p.getAge();
	p.getName();
	p.getSal();
	System.out.println(p.getName());
	System.out.println(p.getAge());
	System.out.println(p.getSal());
}
}
