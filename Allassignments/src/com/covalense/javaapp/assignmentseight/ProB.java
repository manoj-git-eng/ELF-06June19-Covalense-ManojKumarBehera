package com.covalense.javaapp.assignmentseight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ProB {
	public static void main(String[] args) {
		Emp emp1=new Emp("bhavani", 6, 2000,"software engg"); 
		Emp emp2=new Emp("anjali", 1, 4000,"HR"); 
		Emp emp3=new Emp("sahana", 3, 1000,"testing"); 
		Emp emp4=new Emp("vani", 2, 3000,"software engg"); 
		Emp emp5=new Emp("bavana", 4, 2000,"IT"); 
		ArrayList<Emp> t = new ArrayList<Emp>();
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		t.add(emp5);

		
		Comparator<Emp> c=(i,j)->{
			Integer a=i.salary;
			Integer b=j.salary;
			
			return a.compareTo(b);
		};
		Emp minValue= t.stream().max(c).get();
		log.info(" "+minValue);
		
		

		
	}
	}


