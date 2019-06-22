package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro23 {
	public static void main(String[] args) {
		Room r = new Room();

		int i = 2;
		int j = 9;
		int k = 8;

		Room.addAll(i, j, k);
		log.info("" + r.height);

	}
}

class Room {
	int length;
	int weight; 
	int height;

	static int addAll(int length, int weight, int height) {
		return length + weight + height;
	}
}