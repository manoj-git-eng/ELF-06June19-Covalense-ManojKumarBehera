package com.covalense.javaapp.assessmentone;

/*WAP for a method which returns ArrayList, LinkedList, Vector… based on the option entered*/
public class FinalMachineTest {
	public static void main(String[] args) {
		Machine t = new Machine();
		ArraylistProgram a = new ArraylistProgram();
		LinkedlistProgram l = new LinkedlistProgram();
		VectorProgram v = new VectorProgram();
		
		
		t.giveOption(v);  // giving vector object

	}
}
