package com.covalense.javaapp.filehandler;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class TestOp {

	public static void main(String[] args) {
		String s = "little";
		byte[] b = s.getBytes();

		try (FileOutputStream fout = new FileOutputStream("myfile.txt")) {

			fout.write(b);
			log.info("DONE");

		} catch (IOException e) {
			log.severe("IO exception");
		} catch (NullPointerException e) {
			log.severe("Null pointer exception");
		}

	}

}
