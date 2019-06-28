package com.covalense.javaapp.assessmentone;

public class Machine {
	ArraylistProgram a = new ArraylistProgram();
	LinkedlistProgram l = new LinkedlistProgram();
	VectorProgram v = new VectorProgram();

	void giveOption(Object o) {
		if (o == a) {
			a.getArray();
			} else if(o==l) {
				l.getLinked();
			} else {
				v.getVector();
			}
	}

}
