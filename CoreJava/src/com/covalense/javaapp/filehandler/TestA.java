package com.covalense.javaapp.filehandler;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class TestA {
	public static void main(String[] args) {
		File f = new File("M:/Manoj.txt");
		try {
			boolean result = f.createNewFile();
			log.info("Result is " + result);
			log.info("done");

		} catch (IOException e) {
			log.severe("IO Exception");
		}
	}
}
