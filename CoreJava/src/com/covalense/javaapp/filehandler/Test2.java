package com.covalense.javaapp.filehandler;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class Test2 {

	public static void main(String[] args) {
		String s = "little star";
		byte[] b = s.getBytes();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("po.txt", true);
			fout.write(b);
			log.info("DONE");

		} catch (IOException e) {
			log.severe("IO exception");
		}
		try {
			fout.close();
		} catch (IOException e) {
			log.severe("IO exception");
		}
	}
}
