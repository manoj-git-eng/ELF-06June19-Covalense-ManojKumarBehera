package com.covalense.javaapp.assignmentssix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;

/*
 * WAP to store emp WRT role (using Map<string,arraylist<emp>>)
 */
@Log
public class Pro10 {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<>();
		Emp e1 = new Emp();
		e1.set("manoj", 20, "IT", 20000);
		Emp e2 = new Emp();
		e2.set("manoj", 20, "IT", 20000);
		a.add(e1);
		a.add(e2);
		HashMap<String, ArrayList<Emp>> m = new HashMap<String, ArrayList<Emp>>();
		m.put("first", a);
		for (Map.Entry<String, ArrayList<Emp>> e : m.entrySet()) {
			String key = e.getKey();
			log.info(key);
			ArrayList<Emp> ar = e.getValue();
			for (Emp el : ar) {
				el.get();
			}

		}
	}

}