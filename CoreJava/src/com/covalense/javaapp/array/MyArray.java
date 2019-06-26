package com.covalense.javaapp.array;

public class MyArray {
	private Object[] array;
	private int index;

	public MyArray() {

		this(10);
	}

	public MyArray(int size) {

		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than Zero");
		}
		array = new Object[size];
		index = 0;
	}// End of Constructor

	public void add(Object val) {
		array[index] = val;
		index++;
	}

	public Object get(int pos) {

		return array[pos];

	}

	public void remove(int pos) {

		System.arraycopy(array, pos + 1, array, pos, array.length - 1 - pos);

	}

	public int getSize() {
		return index - 1;
	}

}// End of class
