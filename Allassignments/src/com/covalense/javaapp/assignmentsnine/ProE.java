package com.covalense.javaapp.assignmentsnine;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ProE {
public static void main(String[] args) {
		StudentPro s1 = new StudentPro();
		StudentPro s2 = new StudentPro();
		StudentPro s3 = new StudentPro();
		StudentPro s4 = new StudentPro();
		s1.set("soundarya", 18, 67, "female");
		s2.set("nagraj", 21, 77, "male");
		s3.set("manoj", 21, 87, "male");
		s4.set("rajashree", 22, 96, "female");

		ArrayList<StudentPro> t = new ArrayList<StudentPro>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		for (StudentPro s : t) {
			if (s.gender == "female") {
				s.name = "miss " + s.name;
			} else if (s.gender == "male") {
				s.name = "mr " + s.name;
			}
			log.info("name= " + s.name + " " + s.gender + " " + s.marks);
		}

	}

	
}
