package com.covalense.javaapp.filehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Test4 {
	static FileInputStream f = null;

	public static void main(String[] args) {
		try {
			f = new FileInputStream("Manoj.txt");
			int i;
			while ((i = f.read()) != -1) {
				log.info("" + (char) i);
			}
			f.close();
		} catch (FileNotFoundException e) {
			log.severe("File not found Exception");
		} catch (IOException i) {
			log.severe("IO exception");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				log.severe("IO Exception");
			}
		}

	}
}
