package com.covalense.javaapp.array;

public class MyArray {
	private Object[] myArray;
	private int index;
	private int temp;

	public MyArray() {

		this(10);
	}

	public MyArray(int size) {

		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than Zero");
		}
		myArray = new Object[size];
		index = 0;
	}// End of Constructor

	public void add(Object val) {
		myArray[index] = val;
		index++;
	}

	public Object get(int pos) {

		return myArray[pos];
		
	}

	public void remove(int pos) {

		System.arraycopy(myArray, pos+1, myArray,pos,myArray.length-1-pos);
		
	}

	public int getSize() {
		return index-1;
	}
	
}// End of class


