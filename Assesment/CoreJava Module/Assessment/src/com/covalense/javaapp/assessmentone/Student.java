package com.covalense.javaapp.assessmentone;

public class Student {
String name;
int age;
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}

}
