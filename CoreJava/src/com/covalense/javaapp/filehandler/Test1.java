package com.covalense.javaapp.filehandler;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Test1 {
	public static void main(String[] args) {
		String s = "hi all";
		FileOutputStream fout = null;
		byte[] b = s.getBytes();
		try {
			fout = new FileOutputStream("myFile.txt");
			fout.write(b);
			log.info("DONE");

		} catch (IOException e) {
			log.severe("IO EXCEPTION");
		} finally {
			try {

				fout.close();
			} catch (IOException e) {
				log.severe("IO EXCEPTION");
			}
		}
	}
}
